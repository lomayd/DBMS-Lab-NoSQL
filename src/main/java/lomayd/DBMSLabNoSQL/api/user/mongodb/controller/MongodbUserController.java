package lomayd.DBMSLabNoSQL.api.user.mongodb.controller;

import lomayd.DBMSLabNoSQL.api.user.mongodb.dto.MongodbUserRequestDto;
import lomayd.DBMSLabNoSQL.api.user.mongodb.dto.MongodbUserResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lomayd.DBMSLabNoSQL.api.user.mongodb.service.MongodbUserService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class MongodbUserController {

    private final MongodbUserService mongodbUserService;

    @PostMapping("/mongodb")
    public ResponseEntity<Void> mongodbJoinUser(@RequestBody MongodbUserRequestDto.UserJoin userJoin) {
        mongodbUserService.mongodbJoinUser(userJoin);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/mongodb")
    public ResponseEntity<MongodbUserResponseDto.UserInfo> mongodbGetUser(@RequestParam String id) {
        return ResponseEntity.ok(mongodbUserService.mongodbGetUser(id));
    }

    @PatchMapping("/mongodb")
    public ResponseEntity<Void> mongodbModifyUser(@RequestParam String id, @RequestBody MongodbUserRequestDto.UserModify userModify) {
        mongodbUserService.mongodbModifyUser(id, userModify);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/mongodb")
    public ResponseEntity<Void> mongodbRemoveUser(@RequestParam String id) {
        mongodbUserService.mongodbRemoveUser(id);
        return ResponseEntity.ok().build();
    }
}
