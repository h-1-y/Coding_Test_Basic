SELECT
      A.MEMBER_NAME
    , B.REVIEW_TEXT
    , TO_CHAR(B.REVIEW_DATE, 'YYYY-MM-DD') AS REVIEW_DATE
FROM
    (
        SELECT
              A.MEMBER_ID  
            , B.MEMBER_NAME
        FROM
            (
                SELECT
                      MEMBER_ID
                    , DENSE_RANK() OVER (ORDER BY COUNT(*) DESC) AS RN
                    , COUNT(*) AS CNT
                FROM
                    REST_REVIEW
                GROUP BY
                    MEMBER_ID
            ) A
        LEFT OUTER JOIN
            MEMBER_PROFILE B
        ON
            A.MEMBER_ID = B.MEMBER_ID
        WHERE
            A.RN = 1
    ) A
LEFT OUTER JOIN
    REST_REVIEW B
ON
    A.MEMBER_ID = B.MEMBER_ID
ORDER BY
    B.REVIEW_DATE, B.REVIEW_TEXT