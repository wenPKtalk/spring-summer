package com.topsion.summer.presentation;

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
