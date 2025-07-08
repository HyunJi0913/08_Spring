package org.scoula.controller;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 🏠 홈(메인) 페이지 컨트롤러
 * - 애플리케이션의 메인 페이지와 기본 요청을 처리하는 컨트롤러
 *
 * 📋 주요 기능:
 * - 루트 경로("/") 요청 처리
 * - 홈페이지 렌더링
 * - 기본 진입점 역할
 *
 * @Controller
 * - @ComponentScan 어노테이션으로 스캔된 경우 자동으로 Bean 등록되는
 *   @Component 어노테이션의 하위 어노테이션
 * - Spring MVC 컨트롤러임을 명시
 *
 * @Log4j2
 * - Lombok을 이용해 log 관련 필드를 생성하는 어노테이션
 * - private static final org.apache.logging.log4j.Logger log
 *   = org.apache.logging.log4j.LogManager.getLogger(HomeController.class)
 */
@Controller
@Slf4j
public class HomeController {
    @GetMapping("/")
    public String home() {
// log.info("================> HomController /");
// return "index"; // View의 이름
        return "index";
    }
}