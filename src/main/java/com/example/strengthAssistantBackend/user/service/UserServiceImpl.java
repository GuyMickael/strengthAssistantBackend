package com.example.strengthAssistantBackend.user.service;

import com.example.strengthAssistantBackend.user.model.User;
import com.example.strengthAssistantBackend.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Mono<User> getUserById(String id) {
        return this.userRepository.getUserById(id);
    }

    @Override
    public Flux<User> createUser(Mono<User> user) {
        return this.userRepository.insert(user);
    }

    @Override
    public Mono<User> updateUser(Mono<User> user) {
        return this.userRepository.save(user);
    }

    @Override
    public Mono<Void> deleteUserById(String id) {
        return this.userRepository.deleteById(id);
    }
}
