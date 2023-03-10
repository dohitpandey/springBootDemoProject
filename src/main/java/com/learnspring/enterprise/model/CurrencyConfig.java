package com.learnspring.enterprise.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "currency-service")
@Data
public class CurrencyConfig {
    private String url;
    private String user;
    private String key;
}
