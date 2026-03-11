SELECT
      HOUR
    , COUNT(*) AS COUNT
FROM
    (
        SELECT
              ANIMAL_TYPE
            , CAST(TO_CHAR(DATETIME, 'FMHH24') AS NUMBER(10)) AS HOUR
        FROM
            ANIMAL_OUTS
    )
GROUP BY
    HOUR
HAVING 
    HOUR >= 9
AND
    HOUR <= 19
ORDER BY
    HOUR