package com.resturant.menuService.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(securedEnabled = true, jsr250Enabled = true)
@Slf4j
public class SecurityConfig {

	private static final String[] AUTH_WHITELIST = {
			"/api/menu/",
			"/api/menu/tables/"




	};

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http.
				csrf(AbstractHttpConfigurer::disable)
				//.cors(cors -> cors.configurationSource(corsConfigurationSource()))
				.oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults()))
				.authorizeHttpRequests(
						authorizeRequests -> authorizeRequests
								.requestMatchers(AUTH_WHITELIST)
								.permitAll()
								.anyRequest()
								.authenticated()
				).build();
	}
}
