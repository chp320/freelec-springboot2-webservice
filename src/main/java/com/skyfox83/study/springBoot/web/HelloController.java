package com.skyfox83.study.springBoot.web;

import com.skyfox83.study.springBoot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // controller를 JSON을 반환하는 controller로 만들어줌
public class HelloController {

    @GetMapping("/hello")   // HTTP GET method 요청 시 반환
    public String hello() {
        return "hello" ;
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto (@RequestParam("name") String name,
                                      @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount) ;
    }
}
