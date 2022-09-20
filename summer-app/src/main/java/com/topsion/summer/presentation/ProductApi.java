package com.topsion.summer.presentation;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductApi {

    @PostMapping("/product")
    public void createProduct(ProductCreationRequest creationRequest) {


    }
}
