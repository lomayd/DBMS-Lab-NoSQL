package lomayd.DBMSLabNoSQL.api.user.elasticsearch.service;

import lomayd.DBMSLabNoSQL.api.user.elasticsearch.dto.ElasticsearchUserRequestDto;
import lomayd.DBMSLabNoSQL.api.user.elasticsearch.dto.ElasticsearchUserResponseDto;
import org.springframework.stereotype.Service;

import lomayd.DBMSLabNoSQL.api.user.elasticsearch.ElasticsearchUser;
import lomayd.DBMSLabNoSQL.api.user.elasticsearch.repository.ElasticsearchUserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ElasticsearchUserService {
    
    private final ElasticsearchUserRepository elasticsearchUserRepository;

    public void elasticsearchJoinUser(ElasticsearchUserRequestDto.UserJoin userJoin){
        ElasticsearchUser elasticsearchUser = ElasticsearchUser.builder()
                .id(userJoin.getId())
                .password(userJoin.getPassword())
                .name(userJoin.getName())
                .nickname(userJoin.getNickname())
                .email(userJoin.getEmail())
                .age(userJoin.getAge())
                .build();

        elasticsearchUserRepository.save(elasticsearchUser);
    }

    public ElasticsearchUserResponseDto.UserInfo elasticsearchGetUser(String id) {
        ElasticsearchUser elasticsearchUser = elasticsearchUserRepository.findById(id).get();

        return ElasticsearchUserResponseDto.UserInfo.of(elasticsearchUser);
    }

    public void elasticsearchModifyUser(String id, ElasticsearchUserRequestDto.UserModify userModify) {
        ElasticsearchUser elasticsearchUser = elasticsearchUserRepository.findById(id).get();

        elasticsearchUser.setPassword(userModify.getPassword());
        elasticsearchUser.setName(userModify.getName());
        elasticsearchUser.setNickname(elasticsearchUser.getNickname());
        elasticsearchUser.setEmail(elasticsearchUser.getEmail());
        elasticsearchUser.setAge(elasticsearchUser.getAge());

        elasticsearchUserRepository.save(elasticsearchUser);
    }

    public void elasticsearchRemoveUser(String id) {
        elasticsearchUserRepository.deleteById(id);
    }
}
