/**
 * 가격대 별 상품 개수 구하기(Lv. 2)
 * https://school.programmers.co.kr/learn/courses/30/lessons/131530
 */

-- TRUNCATE(컬럼, n) => 컬럼 값의 소숫점 n 자리 아래까지 버림
-- 컬럼값 : 123.456
-- n = 1 => 123.4 / n = 2 => 123.45
-- n = -1 => 120 / n = -2 => 100
SELECT 
	TRUNCATE(PRICE, -4) AS PRICE_GROUP, COUNT(*) AS PRODUCTS
FROM 
	PRODUCT
GROUP BY 
	PRICE_GROUP
ORDER BY 
	PRICE_GROUP