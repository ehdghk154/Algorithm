/**
 * 인기있는 아이스크림(Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/133024
 */

SELECT FLAVOR 
FROM FIRST_HALF
ORDER BY TOTAL_ORDER DESC, SHIPMENT_ID ASC
--total_order로 내림차순 정렬 후 중복 값은 shipment_id로 오름차순 정렬