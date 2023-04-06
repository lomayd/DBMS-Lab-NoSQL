package lomayd.DBMSLabNoSQL.api.user.elasticsearch.dto;

import lomayd.DBMSLabNoSQL.api.user.elasticsearch.ElasticsearchUser;
import lombok.*;

public class ElasticsearchUserResponseDto {

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

        public static UserInfo of(ElasticsearchUser elasticsearchUser) {
            return UserInfo.builder()
                    .id(elasticsearchUser.getId())
                    .password(elasticsearchUser.getPassword())
                    .name(elasticsearchUser.getName())
                    .nickname(elasticsearchUser.getNickname())
                    .email(elasticsearchUser.getEmail())
                    .age(elasticsearchUser.getAge())
                    .build();
        }
    }
}
