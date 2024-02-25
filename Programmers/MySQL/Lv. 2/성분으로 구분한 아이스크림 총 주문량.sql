/**
 * 성분으로 구분한 아이스크림 총 주문량(Lv. 2)
 * https://school.programmers.co.kr/learn/courses/30/lessons/133026
 */

SELECT 
	INGREDIENT_TYPE, SUM(TOTAL_ORDER) AS TOTAL_ORDER
FROM 
	FIRST_HALF JOIN ICECREAM_INFO USING(FLAVOR)
GROUP BY 
	INGREDIENT_TYPE
ORDER BY 
	TOTAL_ORDER