package com.kh.finalproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// Spring Security 자동 설정 제외
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class FinalprojectApplication extends SpringBootServletInitializer { // 1. 여기 extends 추가 필수!

    // 2. 외장 톰캣 배포를 위한 설정 메서드 (오버라이드)
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FinalprojectApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(FinalprojectApplication.class, args);
    }
}