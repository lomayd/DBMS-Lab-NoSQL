package lomayd.DBMSLabNoSQL.api.user.redis.dto;

import lomayd.DBMSLabNoSQL.api.user.redis.RedisUser;
import lombok.*;

public class RedisUserResponseDto {

    @Builder
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserInfo {
        private String id;
        private String password;
        private String name;
        private String nickname;
        private String email;
        private Integer age;

        public static UserInfo of(RedisUser redisUser) {
            return UserInfo.builder()
                    .id(redisUser.getId())
                    .password(redisUser.getPassword())
                    .name(redisUser.getName())
                    .nickname(redisUser.getNickname())
                    .email(redisUser.getEmail())
                    .age(redisUser.getAge())
                    .build();
        }
    }
}
