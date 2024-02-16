/**
 * 조건에 맞는 회원수 구하기(Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/131535
 */

SELECT 
    COUNT(*) 
FROM 
    USER_INFO 
WHERE 
    JOINED LIKE '2021%' --2021이 포함되어 있는지
    AND AGE >= 20 
    AND AGE <= 29
    
-------------------------------------------------
    
SELECT 
    COUNT(*) 
FROM 
    USER_INFO 
WHERE 
    YEAR(JOINED) = '2021' --연도가 2021인지
    AND AGE BETWEEN 20 AND 29 --컬럼명 BETWEEN 값1 AND 값2 = 값1과 값2 사이(이상, 이하)
    