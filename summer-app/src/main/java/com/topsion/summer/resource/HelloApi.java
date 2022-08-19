package com.topsion.summer.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloApi {

    @GetMapping
    public String sayHello() {
        return "Hello World";
    }
}
