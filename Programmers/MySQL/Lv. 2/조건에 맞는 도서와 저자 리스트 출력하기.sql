/**
 * 조건에 맞는 도서와 저자 리스트 출력하기(Lv. 2)
 * https://school.programmers.co.kr/learn/courses/30/lessons/144854
 */


SELECT 
	BOOK_ID, AUTHOR_NAME, DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM 
	BOOK JOIN AUTHOR USING(AUTHOR_ID)
WHERE 
	CATEGORY = '경제'
ORDER BY 
	PUBLISHED_DATE