package org.specter.template.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
    scanBasePackages = "org.specter.template"
)
public class Boot {

  public static void main(String[] args) {
    SpringApplication.run(Boot.class, args);
  }
}