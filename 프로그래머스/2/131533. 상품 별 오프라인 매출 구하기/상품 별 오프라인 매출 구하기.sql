SELECT
      PRODUCT_CODE
    , SUM(SALES) AS SALES
FROM
    (
        SELECT
              P.PRODUCT_CODE
            , P.PRICE * O.SALES_AMOUNT AS SALES
        FROM
            OFFLINE_SALE O
        JOIN
            PRODUCT P
        ON
            O.PRODUCT_ID = P.PRODUCT_ID
    )
GROUP BY
    PRODUCT_CODE
ORDER BY
    SALES DESC, PRODUCT_CODE