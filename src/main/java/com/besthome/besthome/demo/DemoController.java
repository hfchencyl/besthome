package com.besthome.besthome.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class DemoController {

    @RequestMapping("/demo")
    public String demoMethod() {
        return "hello world!";
    }
}
