package com.topsion.summer.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloApi {

    @GetMapping
    public String sayHello() {
        return "World Hello ";
    }
}
