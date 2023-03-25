package lomayd.DBMSLabNoSQL.api.user;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash(value = "Users")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RedisUser {

    @Id
    private String id;

    private String password;
    private String name;
    private String nickname;
    private String email;
    private Integer age;
}
