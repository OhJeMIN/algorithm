SELECT 
    T1.ANIMAL_ID
    ,T1.NAME
FROM 
    ANIMAL_OUTS T1
WHERE 
    NOT EXISTS (
        SELECT 1
        FROM 
            ANIMAL_INS  T2
        WHERE
            T1.ANIMAL_ID = T2.ANIMAL_ID
    )
ORDER BY 
    T1.ANIMAL_ID;
