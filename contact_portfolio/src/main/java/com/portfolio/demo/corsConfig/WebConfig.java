package com.portfolio.demo.corsConfig;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// TODO Auto-generated method stub
		registry.addMapping("/**")
        .allowedOrigins("http://localhost:5500") 
        .allowedMethods("GET", "POST", "PUT", "DELETE");
		
	}
}
