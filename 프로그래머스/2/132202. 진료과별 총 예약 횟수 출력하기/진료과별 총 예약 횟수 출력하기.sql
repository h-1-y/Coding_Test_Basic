SELECT
    *
FROM
    (
        SELECT
              MCDP_CD AS 진료과코드
            , COUNT(*) AS CNT
        FROM
            APPOINTMENT
        WHERE
            TO_CHAR(APNT_YMD, 'YYYYMM') = '202205'
        GROUP BY
            MCDP_CD
    )
ORDER BY
    CNT, 진료과코드