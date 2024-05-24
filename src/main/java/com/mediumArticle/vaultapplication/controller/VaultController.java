package com.mediumArticle.vaultapplication.controller;

import com.mediumArticle.vaultapplication.VaultApplication;
import com.mediumArticle.vaultapplication.config.VaultConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VaultController {

    @Autowired
    private VaultConfig vaultConfig;

    private static final Logger Logger = LoggerFactory.getLogger(VaultApplication.class);

    @GetMapping("/getDataFromVault")
    public void getDataFromVault() {
        String databaseInfo = vaultConfig.getDatabase();
        Logger.info("Database : {}", databaseInfo);
        Logger.info("Port : {}", vaultConfig.getPort());
        Logger.info("User : {}", vaultConfig.getPort());
        Logger.info("Password : {}", vaultConfig.getDatabase());
    }
}