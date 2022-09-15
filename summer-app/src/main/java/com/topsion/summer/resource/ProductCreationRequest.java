package com.topsion.summer.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductCreationRequest {
    private String name;
    private String category;
    private String code;
}
