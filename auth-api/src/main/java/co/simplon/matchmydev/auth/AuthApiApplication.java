package co.simplon.matchmydev.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

// FIXME:remove exclude 
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class AuthApiApplication {

    public static void main(String[] args) {
	SpringApplication.run(AuthApiApplication.class, args);
    }

}
