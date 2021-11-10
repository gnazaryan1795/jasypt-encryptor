package com.test.jasypt.controller;

import com.test.jasypt.EncryptedConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetrieveController {

    private EncryptedConfig encryptedConfig;

    @Autowired
    public void setEncryptedConfig(EncryptedConfig encryptedConfig) {
        this.encryptedConfig = encryptedConfig;
    }

    @GetMapping(value = "/printEncryptedProp", produces = MediaType.TEXT_PLAIN_VALUE)
    public String printEncryptedProp() {
        return "Encrypted pass prop1: " + encryptedConfig.getProperty() + ", prop2: " + encryptedConfig.getProperty2();
    }

}
