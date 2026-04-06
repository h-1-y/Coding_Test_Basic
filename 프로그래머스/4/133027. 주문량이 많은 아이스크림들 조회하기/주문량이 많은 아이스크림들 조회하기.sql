SELECT
    FLAVOR
FROM
    (
        SELECT
              FLAVOR
            , SUM(TOTAL_ORDER) AS ORDERS
        FROM
            (
                SELECT
                      FLAVOR
                    , TOTAL_ORDER
                FROM
                    FIRST_HALF

                UNION ALL

                SELECT
                      FLAVOR
                    , TOTAL_ORDER
                FROM
                    JULY
            ) A
        GROUP BY
            FLAVOR
        ORDER BY
            ORDERS DESC
    )
WHERE
    ROWNUM < 4