SELECT
      YEAR
    , MONTH
    , GENDER
    , COUNT(USER_ID) AS USERS
FROM
    (
        SELECT DISTINCT
              TO_CHAR(SALES_DATE, 'YYYY') AS YEAR
            , CAST(TO_CHAR(SALES_DATE, 'MM') AS NUMBER(10)) AS MONTH
            , B.GENDER
            , B.USER_ID
        FROM
            ONLINE_SALE A
        LEFT OUTER JOIN
            USER_INFO B
        ON
            A.USER_ID = B.USER_ID
        WHERE
            B.GENDER IS NOT NULL
    )
GROUP BY
    YEAR, MONTH, GENDER
ORDER BY
    YEAR, MONTH, GENDER