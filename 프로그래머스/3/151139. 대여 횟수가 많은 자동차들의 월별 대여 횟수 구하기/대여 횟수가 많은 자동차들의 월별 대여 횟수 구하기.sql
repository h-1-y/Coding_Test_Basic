SELECT
              CAR_ID
            , SUM(RECORDS) AS RECORDS
        FROM
            (
                SELECT
                      CAR_ID
                    , MONTH
                    , COUNT(*) AS RECORDS
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
            SUM(RECORDS) >= 5