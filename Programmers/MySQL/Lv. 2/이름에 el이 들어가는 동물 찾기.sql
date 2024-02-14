/**
 * 이름에 el이 들어가는 동물 찾기(Lv. 2)
 * https://school.programmers.co.kr/learn/courses/30/lessons/59047
 */

SELECT 
	ANIMAL_ID, NAME 
FROM 
	ANIMAL_INS 
WHERE 
	ANIMAL_TYPE = 'Dog' 
	AND 
	NAME LIKE '%EL%' --LIKE = 특정 문자 검색
ORDER BY NAME