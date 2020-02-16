package com.skyfox83.study.springBoot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is ;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)    // 테스트 진행 시 JUnit에 내장된 실행자 외에 다른 실행자(SpringRunner)를 사용함
                                // 스프링부트테스트와 JUnit 사이의 연결자 역할함. => 실행자가 뭐지?? ;;
//@WebMvcTest(controllers = HelloController.class)
@WebMvcTest
public class HelloControllerTest {

    @Autowired  // 스프링이 관리하는 빈(Bean)을 주입받음 => 빈이 뭐지?? ;;
    private MockMvc mvc ;   // 스프링 MVC 테스트의 시작점으로 웹API 테스트 시 사용함.
                            // 이를 통해 http get/post 등에 대한 API 테스트 수행

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello" ;

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello)) ;
    }

    @Test
    public void helloDto가_리턴된다() throws Exception {
        String name = "hello" ;
        int amount = 1000 ;

        mvc.perform(
                    get("/hello/dto")
                            .param("name", name)
                            .param("amount", String.valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount", is(amount))) ;
    }
}
