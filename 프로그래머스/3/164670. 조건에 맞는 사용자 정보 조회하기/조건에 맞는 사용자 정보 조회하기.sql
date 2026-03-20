SELECT
      B.USER_ID
    , B.NICKNAME
    , B.CITY || ' ' || B.STREET_ADDRESS1 || ' ' || B.STREET_ADDRESS2 AS 전체주소
    , SUBSTR(B.TLNO, 0, 3) || '-' || SUBSTR(B.TLNO, 4, 4) || '-' || SUBSTR(B.TLNO, 8, 4) AS 전화번호
FROM
    (
    SELECT
        WRITER_ID
    FROM
        USED_GOODS_BOARD
    GROUP BY
        WRITER_ID
    HAVING
        COUNT(*) >= 3
    ) A
LEFT OUTER JOIN
    USED_GOODS_USER B
ON
    A.WRITER_ID = B.USER_ID
ORDER BY
    B.USER_ID DESC