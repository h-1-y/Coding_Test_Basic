SELECT
      ANIMAL_ID	
    , NAME
    , SEX_UPON_INTAKE
FROM
    ANIMAL_INS
WHERE
    NAME IN ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
AND
    SEX_UPON_INTAKE = 'Spayed Female'
ORDER BY
    ANIMAL_ID, NAME