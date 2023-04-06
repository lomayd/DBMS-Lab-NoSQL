package lomayd.DBMSLabNoSQL.api.user.redis.service;

import lomayd.DBMSLabNoSQL.api.user.redis.dto.RedisUserRequestDto;
import lomayd.DBMSLabNoSQL.api.user.redis.dto.RedisUserResponseDto;
import org.springframework.stereotype.Service;

import lomayd.DBMSLabNoSQL.api.user.redis.RedisUser;
import lomayd.DBMSLabNoSQL.api.user.redis.repository.RedisUserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RedisUserService {

    private final RedisUserRepository redisUserRepository;

    public void redisJoinUser(RedisUserRequestDto.UserJoin userJoin){
        RedisUser redisUser = RedisUser.builder()
                .id(userJoin.getId())
                .password(userJoin.getPassword())
                .name(userJoin.getName())
                .nickname(userJoin.getNickname())
                .email(userJoin.getEmail())
                .age(userJoin.getAge())
                .build();

        redisUserRepository.save(redisUser);
    }

    public RedisUserResponseDto.UserInfo redisGetUser(String id) {
        RedisUser redisUser = redisUserRepository.findById(id).get();

        return RedisUserResponseDto.UserInfo.of(redisUser);
    }

    public void redisModifyUser(String id, RedisUserRequestDto.UserModify userModify) {
        RedisUser redisUser = redisUserRepository.findById(id).get();

        redisUser.setPassword(userModify.getPassword());
        redisUser.setName(userModify.getName());
        redisUser.setNickname(redisUser.getNickname());
        redisUser.setEmail(redisUser.getEmail());
        redisUser.setAge(redisUser.getAge());

        redisUserRepository.save(redisUser);
    }

    public void redisRemoveUser(String id) {
        redisUserRepository.deleteById(id);
    }
}
