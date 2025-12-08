package com.kh.finalproject.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfiguration implements	WebMvcConfigurer {

	@Autowired
	private TokenRenewalInterceptor tokenRenewalInterceptor;

	public void addInterceptors(InterceptorRegistry registry) {
		
		//토큰 재발급 인터셉터
		registry.addInterceptor(tokenRenewalInterceptor)
			.addPathPatterns("/**")
			.excludePathPatterns(
					"member/join",
					"member/login",
					"member/logout",
					"member/refresh");
	}
}
