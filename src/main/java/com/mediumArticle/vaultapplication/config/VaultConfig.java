package com.mediumArticle.vaultapplication.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Getter
@Configuration
public class VaultConfig {

    @Value("${database}")
    private String database;

    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    @Value("${port}")
    private String port;

}
