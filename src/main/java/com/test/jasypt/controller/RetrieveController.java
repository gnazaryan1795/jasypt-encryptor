package com.test.jasypt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetrieveController {

    @Value("${encrypted.property}")
    private String property;

    @Value("${encrypted.property2}")
    private String property2;

    @GetMapping(value = "/printEncryptedProp", produces = MediaType.TEXT_PLAIN_VALUE)
    public String printEncryptedProp() {
        return "Encrypted pass prop1: " + property + ", prop2: " + property2;
    }

}
