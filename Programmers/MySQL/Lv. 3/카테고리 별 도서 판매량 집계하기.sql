/**
 * 카테고리 별 도서 판매량 집계하기(Lv. 3)
 * https://school.programmers.co.kr/learn/courses/30/lessons/144855
 */
-- JOIN 사용 X
SELECT 
    CATEGORY, SUM(SALES) AS TOTAL_SALES
FROM 
    BOOK A, BOOK_SALES B
WHERE 
	A.BOOK_ID = B.BOOK_ID
    AND DATE_FORMAT(SALES_DATE, '%Y-%m') = '2022-01'
GROUP BY
    CATEGORY
ORDER BY
    CATEGORY
    
---------------------------------------------------------
-- JOIN 테이블명 ON 기준1 = 기준2
SELECT 
    CATEGORY, SUM(SALES) AS TOTAL_SALES
FROM 
    BOOK A JOIN BOOK_SALES B ON A.BOOK_ID = B.BOOK_ID
WHERE 
    DATE_FORMAT(SALES_DATE, '%Y-%m') = '2022-01'
GROUP BY
    CATEGORY
ORDER BY
    CATEGORY

---------------------------------------------------------
-- JOIN 테이블명 USING(컬럼명) => 두 테이블의 컬럼명이 같을 경우 사용 가능
SELECT 
    CATEGORY, SUM(SALES) AS TOTAL_SALES
FROM 
    BOOK JOIN BOOK_SALES USING(BOOK_ID)
WHERE 
    DATE_FORMAT(SALES_DATE, '%Y-%m') = '2022-01'
GROUP BY
    CATEGORY
ORDER BY
    CATEGORY