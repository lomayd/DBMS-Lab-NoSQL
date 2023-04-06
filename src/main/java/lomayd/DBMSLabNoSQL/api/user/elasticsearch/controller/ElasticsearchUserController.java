package lomayd.DBMSLabNoSQL.api.user.elasticsearch.controller;

import lomayd.DBMSLabNoSQL.api.user.elasticsearch.dto.ElasticsearchUserRequestDto;
import lomayd.DBMSLabNoSQL.api.user.elasticsearch.dto.ElasticsearchUserResponseDto;
import lomayd.DBMSLabNoSQL.api.user.elasticsearch.service.ElasticsearchUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class ElasticsearchUserController {

    private final ElasticsearchUserService elasticsearchUserService;

    @PostMapping("/elasticsearch")
    public ResponseEntity<Void> elasticsearchJoinUser(@RequestBody ElasticsearchUserRequestDto.UserJoin userJoin) {
        elasticsearchUserService.elasticsearchJoinUser(userJoin);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/elasticsearch")
    public ResponseEntity<ElasticsearchUserResponseDto.UserInfo> elasticsearchGetUser(@RequestParam String id) {
        return ResponseEntity.ok(elasticsearchUserService.elasticsearchGetUser(id));
    }

    @PatchMapping("/elasticsearch")
    public ResponseEntity<Void> elasticsearchModifyUser(@RequestParam String id, @RequestBody ElasticsearchUserRequestDto.UserModify userModify) {
        elasticsearchUserService.elasticsearchModifyUser(id, userModify);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/elasticsearch")
    public ResponseEntity<Void> elasticsearchRemoveUser(@RequestParam String id) {
        elasticsearchUserService.elasticsearchRemoveUser(id);
        return ResponseEntity.ok().build();
    }
}
