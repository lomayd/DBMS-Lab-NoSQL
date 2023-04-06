package lomayd.DBMSLabNoSQL.api.user.redis;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@RedisHash(value = "redisuser")
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
