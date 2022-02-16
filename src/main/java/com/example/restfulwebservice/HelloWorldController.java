package com.example.restfulwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
//  GET
//  /hello-world (endpoint)
//  @RequestMapping(method= RequestMethod.GET, path="/hello-world")
//SpringBoot 프로젝트 생성
//RestContoller 생성
//lombok 활용 Bean 생성
    @GetMapping(path="/hello-world")
    public String helloWorld() {
        return "Hello World";
    }
    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }
}
