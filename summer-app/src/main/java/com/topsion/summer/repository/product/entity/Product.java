package com.topsion.summer.repository.product.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Table(name = "product_list")
@Entity
public class Product {

    @EmbeddedId
    @GeneratedValue(strategy= GenerationType.AUTO)
    private ProjectId id;
    private String name;
    private String category;
    private String code;
}
