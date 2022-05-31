package com.example.strengthAssistantBackend.user.controller;

import com.example.strengthAssistantBackend.user.model.User;
import com.example.strengthAssistantBackend.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/api/user")
@ComponentScan("com.example.strengthAssistantBacked.user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public static String getUser(){
        return "Working";
    }
    @PutMapping
    public Flux<User> putUser(@RequestBody Mono<User> user){
        return this.userService.createUser(user);
    }
}
