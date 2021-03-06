package config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {
  private String driverClassName;
  private String url;
  private String username;
  private String password;

  @Profile("dev")
  @Bean
  public String testDatabaseConnection() {
    System.out.println("DB connection for DEV");
    System.out.println(driverClassName);
    System.out.println(url);
    System.out.println(username);
    System.out.println(password);
    return "DB Connection to H2_Test - Test instance";
  }

  @Profile("prod")
  @Bean
  public String productionDatabaseConnection() {
    System.out.println("DB connection for PROD");
    System.out.println(driverClassName);
    System.out.println(url);
    System.out.println(username);
    System.out.println(password);
    return "DB Connection to MYSQL_PROD - Production instance";
  }

}
