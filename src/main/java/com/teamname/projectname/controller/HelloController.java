package com.teamname.projectname.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "GitHub Actions를 통한 CI/CD 파이프라인 구축, 정말 쉽죠? ^_^";
    }
}
