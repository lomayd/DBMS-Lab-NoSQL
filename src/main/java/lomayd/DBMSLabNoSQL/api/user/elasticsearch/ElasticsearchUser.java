package lomayd.DBMSLabNoSQL.api.user.elasticsearch;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "elasticsearchuser")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ElasticsearchUser {

    @Id
    private String id;

    private String password;
    private String name;
    private String nickname;
    private String email;
    private Integer age;
}
