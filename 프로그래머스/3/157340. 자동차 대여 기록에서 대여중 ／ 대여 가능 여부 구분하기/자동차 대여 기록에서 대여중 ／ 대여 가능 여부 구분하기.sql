SELECT
      CAR_ID
    , AVAILABILITY
FROM
    (
        SELECT
              A.*
            , ROW_NUMBER() OVER (PARTITION BY CAR_ID ORDER BY CAR_ID, AVAILABILITY DESC) AS RN
        FROM
            (
                SELECT
                      CAR_ID
                    , START_DATE
                    , END_DATE
                    , CASE
                        WHEN TO_CHAR(START_DATE, 'YYYYMMDD') <= '20221016' AND
                             TO_CHAR(END_DATE, 'YYYYMMDD') >= '20221016' THEN '대여중'
                        ELSE '대여 가능'
                       END AVAILABILITY
                FROM
                    CAR_RENTAL_COMPANY_RENTAL_HISTORY
            ) A
    )
WHERE
    RN = 1
ORDER BY
    CAR_ID DESC