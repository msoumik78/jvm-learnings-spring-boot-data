package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class BankCustomersStarter {
    public static void main(String[] args) {
        SpringApplication.run(BankCustomersStarter.class, args);
    }

  @Bean
  public CommandLineRunner demo(JdbcTemplate jdbcTemplate) {
    return (args) -> {
      jdbcTemplate.update("Create table customers (customer_name VARCHAR(50),customer_age int,customer_city VARCHAR(50),customer_state VARCHAR(50),customer_profession VARCHAR(50))");
    };
  }
}
