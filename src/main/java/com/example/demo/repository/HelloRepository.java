package com.example.demo.repository;

import com.example.demo.repository.model.Hello;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface HelloRepository extends ReactiveMongoRepository<Hello, String> {

    Flux<Hello> findAllByLanguage(String language);

    Mono<Hello> findFirstByLanguage(String language);
}
