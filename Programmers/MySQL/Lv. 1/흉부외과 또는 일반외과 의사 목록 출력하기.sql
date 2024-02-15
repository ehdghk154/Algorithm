/**
 * 흉부외과 또는 일반외과 의사 목록 출력하기(Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/132203
 */

SELECT  --DATE_FORMAT(컬럼명(날짜), 형식) = 형식대로 날짜 출력
    DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') AS HIRE_YMD 
FROM 
    DOCTOR 
WHERE 
    MCDP_CD = 'CS' 
    OR MCDP_CD = 'GS'
ORDER BY --HIRE_YMD로 내림차순 정렬 후 값이 같은 것은 DR_NAME으로 오름차순 정렬
    HIRE_YMD DESC, DR_NAME ASC