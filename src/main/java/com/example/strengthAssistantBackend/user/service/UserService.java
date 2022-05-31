package com.example.strengthAssistantBackend.user.service;

import com.example.strengthAssistantBackend.user.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    public Mono<User> getUserById(String id);
    public Flux<User> createUser(Mono<User> user);
    public Mono<User> updateUser(Mono<User> user);
    public Mono<Void> deleteUserById(String id);
}
