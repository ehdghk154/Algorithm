/**
 * 있었는데요 없었습니다(Lv. 3)
 * https://school.programmers.co.kr/learn/courses/30/lessons/59043
 */

SELECT A.ANIMAL_ID, A.NAME
FROM ANIMAL_INS A JOIN ANIMAL_OUTS B ON A.ANIMAL_ID = B.ANIMAL_ID
WHERE A.DATETIME > B.DATETIME
ORDER BY A.DATETIME