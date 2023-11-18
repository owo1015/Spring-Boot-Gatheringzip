package com.example.gatheringzip.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig {

	// 비밀번호 암호화 메소드
	@Bean
	BCryptPasswordEncoder encode() {
		return new BCryptPasswordEncoder();
	}
	
	// 접속 권한 제어 메소드
	@Bean
	SecurityFilterChain configure(HttpSecurity http) throws Exception {
		http
			.csrf((csrf) -> csrf.disable())
	    	.authorizeHttpRequests((authorizeHttpRequests) -> authorizeHttpRequests
	    			.requestMatchers(new AntPathRequestMatcher("/login")).permitAll()
	    			.requestMatchers(new AntPathRequestMatcher("/signup")).permitAll()
	    			.requestMatchers(new AntPathRequestMatcher("/WEB-INF/**")).permitAll()
	    			.anyRequest().authenticated())
			.formLogin((formLogin)-> formLogin
					.loginPage("/login")
					.loginProcessingUrl("/loginProc")
					.defaultSuccessUrl("/"));
	  return http.build();
	}
}