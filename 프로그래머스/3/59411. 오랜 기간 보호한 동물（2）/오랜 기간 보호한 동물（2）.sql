SELECT
      ANIMAL_ID
    , NAME
FROM
    (
        SELECT
              ROWNUM AS RN
            , ANIMAL_ID
            , NAME
            , HOLD_DATE
        FROM
            (
                SELECT
                      A.ANIMAL_ID
                    , A.NAME
                    , ROUND(B.DATETIME - A.DATETIME) AS HOLD_DATE
                FROM
                    ANIMAL_INS A
                INNER JOIN 
                    ANIMAL_OUTS B
                ON
                    A.ANIMAL_ID = B.ANIMAL_ID
                ORDER BY
                    HOLD_DATE DESC
            )
    )
WHERE
    RN <= 2