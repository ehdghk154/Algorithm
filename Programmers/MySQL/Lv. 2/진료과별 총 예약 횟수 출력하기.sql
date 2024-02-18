/**
 * 진료과별 총 예약 횟수 출력하기(Lv. 2)
 * https://school.programmers.co.kr/learn/courses/30/lessons/132202
 */

SELECT MCDP_CD AS '진료과코드', COUNT(APNT_YMD) AS '5월예약건수'
FROM APPOINTMENT
WHERE DATE_FORMAT(APNT_YMD, '%Y-%m') = '2022-05'
GROUP BY MCDP_CD --같은 진료과코드끼리 묶음
ORDER BY COUNT(APNT_YMD), MCDP_CD

-------------------------------------------------------------

SELECT MCDP_CD AS '진료과코드', COUNT(APNT_YMD) AS '5월예약건수'
FROM APPOINTMENT
WHERE DATE_FORMAT(APNT_YMD, '%Y-%m') = '2022-05'
GROUP BY 1
ORDER BY 2, 1