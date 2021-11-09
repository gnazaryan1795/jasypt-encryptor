package com.test.jasypt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.test.jasypt"})
public class JasyptEncryptor {

    public static void main(String[] arguments) {
        System.setProperty("jasypt.encryptor.password", "password");
        SpringApplication.run(JasyptEncryptor.class, arguments);
    }

}
