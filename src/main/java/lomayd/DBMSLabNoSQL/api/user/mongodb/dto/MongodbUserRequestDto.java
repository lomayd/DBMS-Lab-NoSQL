package lomayd.DBMSLabNoSQL.api.user.mongodb.dto;

import lombok.*;

public class MongodbUserRequestDto {

    @Builder
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserJoin {
        private String id;
        private String password;
        private String name;
        private String nickname;
        private String email;
        private Integer age;
    }

    @Builder
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserModify {
        private String password;
        private String name;
        private String nickname;
        private String email;
        private Integer age;
    }
}
