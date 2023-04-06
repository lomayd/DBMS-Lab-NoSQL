package lomayd.DBMSLabNoSQL.api.user.mongodb.service;

import lomayd.DBMSLabNoSQL.api.user.mongodb.dto.MongodbUserRequestDto;
import lomayd.DBMSLabNoSQL.api.user.mongodb.dto.MongodbUserResponseDto;
import org.springframework.stereotype.Service;

import lomayd.DBMSLabNoSQL.api.user.mongodb.MongodbUser;
import lomayd.DBMSLabNoSQL.api.user.mongodb.repository.MongodbUserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MongodbUserService {

    private final MongodbUserRepository mongodbUserRepository;

    public void mongodbJoinUser(MongodbUserRequestDto.UserJoin userJoin){
        MongodbUser mongodbUser = MongodbUser.builder()
                .id(userJoin.getId())
                .password(userJoin.getPassword())
                .name(userJoin.getName())
                .nickname(userJoin.getNickname())
                .email(userJoin.getEmail())
                .age(userJoin.getAge())
                .build();

        mongodbUserRepository.save(mongodbUser);
    }

    public MongodbUserResponseDto.UserInfo mongodbGetUser(String id) {
        MongodbUser mongodbUser = mongodbUserRepository.findById(id).get();

        return MongodbUserResponseDto.UserInfo.of(mongodbUser);
    }

    public void mongodbModifyUser(String id, MongodbUserRequestDto.UserModify userModify) {
        MongodbUser mongodbUser = mongodbUserRepository.findById(id).get();

        mongodbUser.setPassword(userModify.getPassword());
        mongodbUser.setName(userModify.getName());
        mongodbUser.setNickname(mongodbUser.getNickname());
        mongodbUser.setEmail(mongodbUser.getEmail());
        mongodbUser.setAge(mongodbUser.getAge());

        mongodbUserRepository.save(mongodbUser);
    }

    public void mongodbRemoveUser(String id) {
        mongodbUserRepository.deleteById(id);
    }
}
