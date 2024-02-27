/**
 * 루시와 엘라 찾기(Lv. 2)
 * https://school.programmers.co.kr/learn/courses/30/lessons/59046
 */

SELECT 
	ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM 
	ANIMAL_INS
WHERE 
	NAME = 'Lucy' OR NAME = 'Ella'
    OR NAME = 'Pickle' OR NAME = 'Rogan'
    OR NAME = 'Sabrina' OR NAME = 'Mitty'
    
-----------------------------------------------
    
SELECT 
	ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM 
	ANIMAL_INS
WHERE 
	NAME IN('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')