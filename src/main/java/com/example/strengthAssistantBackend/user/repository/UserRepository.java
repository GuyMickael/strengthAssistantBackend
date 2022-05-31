package com.example.strengthAssistantBackend.user.repository;

import com.example.strengthAssistantBackend.user.model.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
    Mono<User> getUserById(String id);
    Mono<User> save(Mono<User> user);
    Mono<Void> deleteById(String id);
}
