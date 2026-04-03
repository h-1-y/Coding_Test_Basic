SELECT
    CART_ID
FROM
    (
        SELECT DISTINCT
              CART_ID
            , NAME
        FROM
            CART_PRODUCTS
        WHERE
            NAME IN ('Milk', 'Yogurt')
    )
GROUP BY
    CART_ID
HAVING
    COUNT(CART_ID) >= 2
ORDER BY
    CART_ID