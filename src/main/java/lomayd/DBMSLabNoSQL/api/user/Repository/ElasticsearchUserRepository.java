package lomayd.DBMSLabNoSQL.api.user.Repository;

import lomayd.DBMSLabNoSQL.api.user.ElasticsearchUser;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ElasticsearchUserRepository extends ElasticsearchRepository<ElasticsearchUser, String> {

}
