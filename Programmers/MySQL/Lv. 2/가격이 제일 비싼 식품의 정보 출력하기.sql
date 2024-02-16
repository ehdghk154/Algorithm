/**
 * 가격이 제일 비싼 식품의 정보 출력하기(Lv. 2)
 * https://school.programmers.co.kr/learn/courses/30/lessons/131115
 */

SELECT 
    *
FROM 
    FOOD_PRODUCT
ORDER BY 
    PRICE DESC --가격 내림차순 정렬
LIMIT 1 --첫 번째 행만 출력

------------------------------------------------

SELECT 
    *
FROM 
    FOOD_PRODUCT
WHERE --해당 가격과 같은 행 출력
    PRICE = ( 
    SELECT --가장 큰 가격 출력
        MAX(PRICE)
    FROM 
        FOOD_PRODUCT
    )