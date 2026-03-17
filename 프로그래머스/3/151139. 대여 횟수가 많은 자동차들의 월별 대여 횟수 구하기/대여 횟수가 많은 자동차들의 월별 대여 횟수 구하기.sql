SELECT
      A.MONTH
    , A.CAR_ID
    , A.CNT AS RECORDS
FROM
    (
        SELECT
              CAR_ID
            , CAST(TO_CHAR(START_DATE, 'FMMM') AS NUMBER(10)) AS MONTH
            , COUNT(*) AS CNT
        FROM
            CAR_RENTAL_COMPANY_RENTAL_HISTORY
        WHERE
            TO_CHAR(START_DATE, 'YYYYMM') >= '202208'
        AND
            TO_CHAR(START_DATE, 'YYYYMM') <= '202210'
        GROUP BY
            CAR_ID, TO_CHAR(START_DATE, 'FMMM')
    ) A
LEFT OUTER JOIN
    (
        SELECT
              CAR_ID
            , SUM(REC) AS REC
        FROM
            (
                SELECT
                      CAR_ID
                    , MONTH
                    , COUNT(*) AS REC
                FROM
                    (
                        SELECT
                              CAR_ID
                            , TO_CHAR(START_DATE, 'MM') AS MONTH
                        FROM
                            CAR_RENTAL_COMPANY_RENTAL_HISTORY
                        WHERE
                            TO_CHAR(START_DATE, 'YYYYMM') >= '202208'
                        AND
                            TO_CHAR(START_DATE, 'YYYYMM') <= '202210'
                    )
                GROUP BY
                    CAR_ID, MONTH
            )
        GROUP BY
            CAR_ID
        HAVING
            SUM(REC) >= 5
    ) B
ON
    A.CAR_ID = B.CAR_ID
WHERE
    B.CAR_ID IS NOT NULL
ORDER BY
    A.MONTH, A.CAR_ID DESC
  