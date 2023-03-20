package com.topsion.summer.application;

import lombok.Getter;

@Getter
public class ProductCreateCommand {
    private String name;
    private String category;
    private String code;
}
