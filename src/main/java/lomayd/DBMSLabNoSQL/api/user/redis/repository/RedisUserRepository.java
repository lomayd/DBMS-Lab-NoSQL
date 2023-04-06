package lomayd.DBMSLabNoSQL.api.user.redis.repository;

import lomayd.DBMSLabNoSQL.api.user.redis.RedisUser;
import org.springframework.data.repository.CrudRepository;

public interface RedisUserRepository extends CrudRepository<RedisUser, String> {

}
