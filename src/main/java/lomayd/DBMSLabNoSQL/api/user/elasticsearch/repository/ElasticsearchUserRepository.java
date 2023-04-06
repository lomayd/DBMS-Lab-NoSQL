package lomayd.DBMSLabNoSQL.api.user.elasticsearch.repository;

import lomayd.DBMSLabNoSQL.api.user.elasticsearch.ElasticsearchUser;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ElasticsearchUserRepository extends ElasticsearchRepository<ElasticsearchUser, String> {

}
