SELECT
      PRICE_GROUP
    , COUNT(*) AS PRODUCTS
FROM
    (
        SELECT
              PRODUCT_ID
            , PRODUCT_CODE
            , PRICE
            , CASE
                WHEN PRICE < 10000 THEN '0'
                ELSE CONCAT(SUBSTR(PRICE, 0, 1), '0000')
              END AS PRICE_GROUP
        FROM
            PRODUCT
    )
GROUP BY
    PRICE_GROUP
ORDER BY
    PRICE_GROUP