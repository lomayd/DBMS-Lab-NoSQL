package lomayd.DBMSLabNoSQL.api.user.mongodb.dto;

import lomayd.DBMSLabNoSQL.api.user.mongodb.MongodbUser;
import lombok.*;

public class MongodbUserResponseDto {

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

        public static UserInfo of(MongodbUser mongodbUser) {
            return UserInfo.builder()
                    .id(mongodbUser.getId())
                    .password(mongodbUser.getPassword())
                    .name(mongodbUser.getName())
                    .nickname(mongodbUser.getNickname())
                    .email(mongodbUser.getEmail())
                    .age(mongodbUser.getAge())
                    .build();
        }
    }
}
