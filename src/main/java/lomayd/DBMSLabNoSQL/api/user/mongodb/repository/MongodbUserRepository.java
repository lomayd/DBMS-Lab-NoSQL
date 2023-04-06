package lomayd.DBMSLabNoSQL.api.user.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import lomayd.DBMSLabNoSQL.api.user.mongodb.MongodbUser;

public interface MongodbUserRepository extends MongoRepository<MongodbUser, String> {

}
