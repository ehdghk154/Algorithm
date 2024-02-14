/**
 * 나이 정보가 없는 회원 수 구하기(Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/131528
 */

--COUNT = 개수 세기 , 컬럼명 as (변경컬럼명) = 컬럼 출력 이름 변경
--컬럼명 IS NULL = 해당 컬럼명의 값이 null인 경우
SELECT COUNT(*) as USERS FROM USER_INFO WHERE AGE IS NULL;