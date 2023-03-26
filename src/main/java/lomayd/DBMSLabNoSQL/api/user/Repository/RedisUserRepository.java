package lomayd.DBMSLabNoSQL.api.user.Repository;

import lomayd.DBMSLabNoSQL.api.user.RedisUser;
import org.springframework.data.repository.CrudRepository;

public interface RedisUserRepository extends CrudRepository<RedisUser, String> {

}
