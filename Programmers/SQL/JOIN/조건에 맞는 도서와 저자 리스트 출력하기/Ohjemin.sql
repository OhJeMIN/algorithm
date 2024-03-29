SELECT
    T1.BOOK_ID
    ,T2.AUTHOR_NAME
    ,TO_CHAR(T1.PUBLISHED_DATE,'YYYY-MM-DD') AS PUBLISHED_DATE
FROM
    BOOK T1
    JOIN AUTHOR T2
    ON T1.AUTHOR_ID = T2.AUTHOR_ID
WHERE
 T1.CATEGORY = '경제'
ORDER BY
    PUBLISHED_DATE;
