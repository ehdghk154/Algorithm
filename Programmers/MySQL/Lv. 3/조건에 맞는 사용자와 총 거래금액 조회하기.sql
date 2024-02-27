/**
 * 조건에 맞는 사용자와 총 거래금액 조회하기(Lv. 3)
 * https://school.programmers.co.kr/learn/courses/30/lessons/164668
 */

SELECT 
	A.USER_ID, A.NICKNAME, SUM(B.PRICE) AS TOTAL_SALES
FROM 
	USED_GOODS_USER A JOIN USED_GOODS_BOARD B ON A.USER_ID = B.WRITER_ID
WHERE 
	STATUS = 'DONE'
GROUP BY 
	A.USER_ID
HAVING -- group으로 묶인 컬럼은 having을 통해 조건 입력
	TOTAL_SALES >= 700000
ORDER BY 
	TOTAL_SALES