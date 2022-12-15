package com.example.demo.repository.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("hello")
public class Hello {
    private String greeting;
    private String language;

    public Hello(String greeting, String language) {
        this.greeting = greeting;
        this.language = language;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
