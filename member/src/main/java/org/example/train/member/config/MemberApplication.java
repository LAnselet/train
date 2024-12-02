package org.example.train.member.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.example")
public class MemberApplication {

  public static void main(String[] args) {
    SpringApplication.run(MemberApplication.class, args);
  }

}
