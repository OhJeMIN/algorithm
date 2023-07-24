SELECT
    T1.CATEGORY
    ,SUM(T2.TOTAL_SALES) AS TOTAL_SALES
FROM
    BOOK T1
    JOIN (
            SELECT 
                BOOK_ID
                ,SUM(SALES) AS TOTAL_SALES
            FROM
                BOOK_SALES
            WHERE
                TO_CHAR(SALES_DATE,'YYYYMM') = '202201'
            GROUP BY
                BOOK_ID
                
    ) T2
    ON T1.BOOK_ID = T2.BOOK_ID
GROUP BY 
    T1.CATEGORY
ORDER BY T1.CATEGORY;
