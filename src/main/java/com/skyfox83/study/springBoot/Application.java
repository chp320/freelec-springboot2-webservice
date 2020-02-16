package com.skyfox83.study.springBoot;
import org.springframework.boot.SpringApplication ;
import org.springframework.boot.autoconfigure.SpringBootApplication ;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing  // JPA Auditing 활성화
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args) ;    // 내장 WAS 수행 - 톰캣이 아닌 스프링 부트로 만들어진 Jar파일로 수행
    }
}
