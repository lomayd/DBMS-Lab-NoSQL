package lomayd.DBMSLabNoSQL.api.user.Repository;

import lomayd.DBMSLabNoSQL.api.user.MongodbUser;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MongodbUserRepository extends ReactiveMongoRepository<MongodbUser, String> {

}
