package org.aj.authclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class AuthClientApplication {
    public static void main(String[] args) {
        log.info("------------------------- app starting... ----------------------");
        SpringApplication.run(AuthClientApplication.class, args);
        log.info("------------------------- app started. -------------------------");
    }
}
