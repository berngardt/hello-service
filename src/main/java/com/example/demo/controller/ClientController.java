package com.example.demo.controller;

import com.example.demo.repository.model.Hello;
import com.example.demo.repository.HelloRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/hello")
public class ClientController {

    private final HelloRepository helloRepository;

    public ClientController(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    @GetMapping
    public Flux<Hello> getHellos(
            @RequestParam(value = "lang", required = false, defaultValue = "") String lang
    ) {
        if (lang.isEmpty()) return helloRepository.findAll();
        else return helloRepository.findAllByLanguage(lang);
    }
}
