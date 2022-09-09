package com.topsion.summer.repository.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "product_list")
public class Product {
    @Id
    private Long id;
    private String name;
    private String category;
    private String code;
}
