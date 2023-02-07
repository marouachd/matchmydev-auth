package co.simplon.matchmydev.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AuthWebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
	registry.addMapping("/useraccount/**")
		.allowedOrigins("https://localhost:1994")
		.allowedMethods("POST", "GET");
    }

}
