package lomayd.DBMSLabNoSQL.api.user.mongodb;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="mongodbuser")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MongodbUser {

    @Id
    private String id;

    private String password;
    private String name;
    private String nickname;
    private String email;
    private Integer age;
}
