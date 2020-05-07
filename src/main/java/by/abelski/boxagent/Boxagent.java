package by.abelski.boxagent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class Boxagent {
    public static void main(String[] args) {
        SpringApplication.run(Boxagent.class, args);
    }

}
