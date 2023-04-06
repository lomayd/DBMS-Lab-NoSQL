-- 전체 key 확인
keys *

-- id에 해당하는 field key 확인
-- {Id}에 해당하는 id 값 넣기
hkeys redisuser:{id}

-- id에 해당하는 field value 확인
-- {Id}에 해당하는 id 값 넣기
-- 모든 value 값은 string으로 변환됌
hvals redisuser:{id}
