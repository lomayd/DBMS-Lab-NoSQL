package lomayd.DBMSLabNoSQL.api.user.redis.controller;

import lomayd.DBMSLabNoSQL.api.user.redis.dto.RedisUserRequestDto;
import lomayd.DBMSLabNoSQL.api.user.redis.dto.RedisUserResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lomayd.DBMSLabNoSQL.api.user.redis.service.RedisUserService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class RedisUserController {

    private final RedisUserService redisUserService;

    @PostMapping("/redis")
    public ResponseEntity<Void> redisJoinUser(@RequestBody RedisUserRequestDto.UserJoin userJoin) {
        redisUserService.redisJoinUser(userJoin);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/redis")
    public ResponseEntity<RedisUserResponseDto.UserInfo> redisGetUser(@RequestParam String id) {
        return ResponseEntity.ok(redisUserService.redisGetUser(id));
    }

    @PatchMapping("/redis")
    public ResponseEntity<Void> redisModifyUser(@RequestParam String id, @RequestBody RedisUserRequestDto.UserModify userModify) {
        redisUserService.redisModifyUser(id, userModify);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/redis")
    public ResponseEntity<Void> redisRemoveUser(@RequestParam String id) {
        redisUserService.redisRemoveUser(id);
        return ResponseEntity.ok().build();
    }
}
