package com.example.hello.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController

public class AppController {
  @Value("${app.message}")
  private String appMessage;

  @Value("${ENV_DB_URL:NENHUMA}")
  private String dbEnvironmentVariable;

  @GetMapping("/")
  public String getAppMessage() {
    return this.appMessage;
  }

  @GetMapping("/env")
  public String getEnvironmentVariableMessage() {
    return this.dbEnvironmentVariable;
  }
}
