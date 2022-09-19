package com.topsion.summer.repository.product.entity;

import com.topsion.summer.service.ProductCreateCommand;
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

    public void createFrom(ProductCreateCommand productCreateCommand) {
        this.name = productCreateCommand.getName();
        this.code = productCreateCommand.getCode();
        this.category = productCreateCommand.getCategory();
    }
}