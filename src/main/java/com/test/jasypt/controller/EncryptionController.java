package com.test.jasypt.controller;

import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EncryptionController {

    private StringEncryptor encryptor;

    @Autowired
    public void setEncryptor(StringEncryptor encryptor) {
        this.encryptor = encryptor;
    }

    @GetMapping(value = "/encrypt/{value}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String encrypt(@PathVariable String value) {
        return encryptor.encrypt(value);
    }

}
