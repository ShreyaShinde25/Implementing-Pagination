package com.example.pagination.resource;


import com.example.pagination.domain.HttpResponse;
import com.example.pagination.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Optional;

import static java.time.LocalTime.now;
import static org.springframework.http.HttpStatus.OK;


@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class UserResource {

    private final UserService userService;
    LocalDateTime date = LocalDateTime.now();


    @GetMapping("/users")
    public ResponseEntity<HttpResponse>getUsers(@RequestParam Optional<String> name, @RequestParam Optional<Integer> page, @RequestParam Optional<Integer> size){
        return ResponseEntity.ok().body(
                HttpResponse.builder()
                        .timeStamp(now().toString())
                        .data(Map.of("page", userService.getUsers(name.orElse(""),page.orElse(0),size.orElse(10))))
                        .message("Users Retrieved")
                        .status(OK)
                        .statusCode(OK.value())
                        .build());
    }
}
