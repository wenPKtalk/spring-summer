package com.topsion.summer.repository.entity;

import lombok.Data;
import org.springframework.context.annotation.Primary;

import javax.persistence.Table;

@Data
@Table(name = "product_list")
public class Product {
    private Long id;
    private String name;
    private String category;
    private String code;
}
