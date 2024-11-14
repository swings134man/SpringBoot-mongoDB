package com.lucas.mongobasic.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping("/bye")
    public String bye() {
        return "Goodbye!";
    }
}
