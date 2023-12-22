package com.purelighters.purelighters.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http,
                                           @Value("${custom.use-ssl:false}") boolean useSSL) throws Exception {

        if (useSSL) {
            // Enforce HTTPS when useSSL is true
            http.requiresChannel()
                    .anyRequest()
                    .requiresSecure();
        }

        // Common security configuration (applied regardless of useSSL)
        http.authorizeRequests()
                .anyRequest().permitAll() // Permit all requests without authentication
                .and()
                .csrf().disable(); // Disable CSRF for simplicity in this example

        return http.build();
    }
}
