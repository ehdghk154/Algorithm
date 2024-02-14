/**
 * 경기도에 위치한 식품창고 목록 출력하기(Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/131114
 */

SELECT --IF(조건, T, F) 조건이 맞을경우 T 출력, 아닐경우 F 출력
    WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, IF(FREEZER_YN IS NULL, 'N', FREEZER_YN) AS FREEZER_YN
FROM 
    FOOD_WAREHOUSE
WHERE
    ADDRESS LIKE '경기도%'
ORDER BY WAREHOUSE_ID

-------------------------------------------------------

SELECT --IFNULL(컬럼명, 대체값) 컬럼명의 값이 null일 경우 대체값으로 출력
    WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, IFNULL(FREEZER_YN, 'N') AS FREEZER_YN
FROM 
    FOOD_WAREHOUSE
WHERE
    ADDRESS LIKE '경기도%'
ORDER BY WAREHOUSE_ID