/**
 * 대여 기록이 존재하는 자동차 리스트 구하기(Lv. 3)
 * https://school.programmers.co.kr/learn/courses/30/lessons/157341
 */

SELECT -- DISTINCT c1, c2, ... => 중복 제거 컬럼이 여러개면 모든 컬럼의 값이 동일한 내용 중복을 제거
	DISTINCT CAR_ID 
FROM 
	CAR_RENTAL_COMPANY_CAR JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY USING(CAR_ID)
WHERE 
	CAR_TYPE = '세단'
    AND MONTH(START_DATE) = '10'
ORDER BY 
	CAR_ID DESC