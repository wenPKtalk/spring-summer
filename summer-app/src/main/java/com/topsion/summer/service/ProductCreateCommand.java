package com.topsion.summer.service;

import lombok.Getter;

@Getter
public class ProductCreateCommand {
    private String name;
    private String category;
    private String code;
}
