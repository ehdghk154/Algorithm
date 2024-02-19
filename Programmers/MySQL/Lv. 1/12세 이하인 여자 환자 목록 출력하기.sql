/**
 * 12세 이하인 여자 환자 목록 출력하기(Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/132201
 */
--IFNULL(컬럼명, 값1) = 해당 컬럼명의 값이 NULL이라면 값1로 대체
SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(TLNO, 'NONE') AS TLNO
FROM PATIENT
WHERE AGE <= 12 AND GEND_CD = 'W'
ORDER BY AGE DESC, PT_NAME ASC