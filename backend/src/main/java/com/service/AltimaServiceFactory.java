package com.example.altima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AltimaServiceFactory {

    private final RestTemplate restTemplate;

    @Autowired
    public AltimaServiceFactory(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public AltimaService createAltimaService() {
        return new AltimaService(restTemplate);
    }
}
