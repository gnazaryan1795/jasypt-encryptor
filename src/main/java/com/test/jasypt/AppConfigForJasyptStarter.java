package com.test.jasypt;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("encrypted.properties")
public class AppConfigForJasyptStarter {
}
