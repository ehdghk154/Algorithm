/**
 * 카테고리 별 상품 개수 구하기(Lv. 2)
 * https://school.programmers.co.kr/learn/courses/30/lessons/131529
 */


SELECT 
    LEFT(PRODUCT_CODE, 2) AS CATEGORY,
    COUNT(PRODUCT_CODE) AS PRODUCTS
FROM 
    PRODUCT
GROUP BY --제품코드 앞 2자리가 같은 것 끼리 묶음
    LEFT(PRODUCT_CODE, 2)
ORDER BY --제품코드 앞 2자리로 오름차순 정렬
    LEFT(PRODUCT_CODE, 2)
