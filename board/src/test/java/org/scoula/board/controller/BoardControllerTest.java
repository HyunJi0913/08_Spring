package org.scoula.board.controller;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.board.service.BoardService;
import org.scoula.config.RootConfig;
import org.scoula.config.ServletConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@ExtendWith(SpringExtension.class)  // JUnit5와 Spring 통합
@WebAppConfiguration                // 웹 어플리케이션 컨텍스트 로드
@ContextConfiguration(classes = {   // 테스트에 사용할 설정 클래스 지정
        RootConfig.class,           // 비즈니스/영속 계층 설정
        ServletConfig.class,        // 웹 계층 설정
})
@Log4j2                            // 로깅 기능 활성화
class BoardControllerTest {

    // 비즈니스 서비스 계층 주입 (실제 빈 사용)
    @Autowired
    BoardService service;

    // 웹 어플리케이션 컨텍스트 주입 (MockMvc 생성용)
    @Autowired
    private WebApplicationContext ctx;

    // HTTP 요청을 시뮬레이션하는 가짜 MVC 객체
    private MockMvc mockMvc;

    // 각 테스트 실행 전 MockMvc 초기화
    @BeforeEach
    public void setup() {
        // 웹 컨텍스트를 이용해 MockMvc 객체 생성
        this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
    }
}