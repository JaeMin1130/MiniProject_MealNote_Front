package edu.pnu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	// CORS 방침 설정
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// 모든 경로에 대하여
		registry.addMapping("/**")
				// Origin이 https://jaemin1130.github.io에 대해.
				.allowedOrigins("https://jaemin1130.github.io")
				// GET, POST, PUT, DELETE 메서드를 허용한다.
				.allowedMethods("GET", "POST", "PUT", "DELETE")
				// 모든 헤더와 인증에 관한 정보도 허용한다.
				.allowCredentials(true).allowedHeaders("*").exposedHeaders(HttpHeaders.AUTHORIZATION);
	}
}