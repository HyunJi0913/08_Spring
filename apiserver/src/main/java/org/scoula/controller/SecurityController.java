package org.scoula.controller;//package org.scoula.controller;
//
//import lombok.extern.log4j.Log4j2;
//import org.scoula.security.account.domain.CustomUser;
//import org.scoula.security.account.domain.MemberVO;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import java.security.Principal;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.web.bind.annotation.RestController;
//
//@Log4j2
//@RequestMapping("/api/security")
//@RestController
//public class SecurityController
//{
//    @GetMapping("/all") // 모두 접근 가능
//    public void doAll()
//    {
//        log.info("do all can access everybody");
//    }
//
//    @GetMapping("/member")
//    public void doMember(Authentication authentication) {
//        UserDetails userDetails = (UserDetails)authentication.getPrincipal();
//        log.info("username = " + userDetails.getUsername());
//    }
//
//    @GetMapping("/admin") // ADMIN 권한 필요
//    public void doAdmin(@AuthenticationPrincipal CustomUser customUser) {
//        MemberVO member = customUser.getMember();
//        log.info("username = " + member);
//    }
//
//    @GetMapping("/login")
//    public void login() {
//        log.info("login page");
//    }
//
//    @GetMapping("/logout")
//    public void logout() {
//        log.info("logout page");
//    }
//}

import lombok.extern.log4j.Log4j2;
import org.scoula.security.account.domain.CustomUser;
import org.scoula.security.account.domain.MemberVO;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RequestMapping("/api/security")
@RestController
public class SecurityController {
    @GetMapping("/all")
    public ResponseEntity<String> doAll() {
        log.info("do all can access everybody");
        return ResponseEntity.ok("All can access everybody");
    }

    @GetMapping("/member")
    public ResponseEntity<String> doMember(Authentication authentication) {
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        log.info("username = " + userDetails.getUsername());
        return ResponseEntity.ok(userDetails.getUsername());
    }

    @GetMapping("/admin")
    public ResponseEntity<MemberVO> doAdmin(@AuthenticationPrincipal CustomUser customUser) {
        MemberVO member = customUser.getMember();
        log.info("username = " + member);
        return ResponseEntity.ok(member);
    }
}