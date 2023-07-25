SELECT
    MCDP_CD AS "진료과 코드"
    ,COUNT(APNT_NO) AS "5월예약건수"
FROM
    APPOINTMENT
WHERE
    TO_CHAR(APNT_YMD,'YYYYMM') = '202205'
GROUP BY
    MCDP_CD
ORDER BY 
    "5월예약건수"
    ,"진료과 코드"
