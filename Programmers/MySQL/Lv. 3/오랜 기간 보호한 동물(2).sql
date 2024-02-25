/**
 * 오랜 기간 보호한 동물(2)(Lv. 3)
 * https://school.programmers.co.kr/learn/courses/30/lessons/59411
 */

SELECT 
	I.ANIMAL_ID, I.NAME
FROM 
	ANIMAL_INS I JOIN ANIMAL_OUTS O ON I.ANIMAL_ID = O.ANIMAL_ID
ORDER BY -- DATEDIFF(A, B) => A와 B의 일 수 차이(A-B)
	DATEDIFF(O.DATETIME, I.DATETIME) DESC
LIMIT 2