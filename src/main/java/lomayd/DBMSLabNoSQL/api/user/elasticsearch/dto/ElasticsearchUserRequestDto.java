package lomayd.DBMSLabNoSQL.api.user.elasticsearch.dto;

import lombok.*;

public class ElasticsearchUserRequestDto {

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
