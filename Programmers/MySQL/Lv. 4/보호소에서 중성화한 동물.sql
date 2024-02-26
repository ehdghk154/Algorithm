/**
 * 보호소에서 중성화한 동물(Lv. 4)
 * https://school.programmers.co.kr/learn/courses/30/lessons/59045
 */


SELECT 
	I.ANIMAL_ID, I.ANIMAL_TYPE, I.NAME
FROM 
	ANIMAL_INS I JOIN ANIMAL_OUTS O ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE 
	SEX_UPON_INTAKE LIKE 'Intact%'
    AND SEX_UPON_OUTCOME NOT LIKE 'Intact%'
ORDER BY 
	I.ANIMAL_ID
	
----------------------------------------------------------------------
	
SELECT 
	I.ANIMAL_ID, I.ANIMAL_TYPE, I.NAME
FROM 
	ANIMAL_INS I JOIN ANIMAL_OUTS O ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE 
	SEX_UPON_INTAKE != SEX_UPON_OUTCOME
ORDER BY 
	I.ANIMAL_ID