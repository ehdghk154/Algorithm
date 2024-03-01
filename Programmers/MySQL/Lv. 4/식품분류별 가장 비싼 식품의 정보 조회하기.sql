/**
 * 식품분류별 가장 비싼 식품의 정보 조회하기(Lv. 2)
 * https://school.programmers.co.kr/learn/courses/30/lessons/131116
 */

-- 서브쿼리 + JOIN => 카테고리 별 가장 높은 금액 => 카테고리와 금액이 맞는 행 출력
SELECT 
	A.CATEGORY, A.PRICE, A.PRODUCT_NAME
FROM 
	FOOD_PRODUCT AS A 
    JOIN (SELECT CATEGORY, MAX(PRICE) AS PRICE 
          FROM FOOD_PRODUCT 
          GROUP BY CATEGORY) AS B
WHERE 
	A.CATEGORY = B.CATEGORY 
    AND A.PRICE = B.PRICE
    AND A.CATEGORY IN('과자', '국', '김치', '식용유')
ORDER BY 
	PRICE DESC