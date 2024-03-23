/**
 * 평균 일일 대여 요금 구하기(Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/151136
 */

--ROUND(value,n): value를 n자리까지 반올림 
SELECT 
	ROUND(SUM(DAILY_FEE)/COUNT(*), 0) AS AVERAGE_FEE 
FROM 
	CAR_RENTAL_COMPANY_CAR
WHERE 
	CAR_TYPE = 'SUV'