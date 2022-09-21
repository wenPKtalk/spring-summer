package com.topsion.summer.application;

import com.topsion.summer.domain.entity.repository.product.ProductRepository;
import com.topsion.summer.domain.entity.repository.product.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Boolean createProduct(ProductCreateCommand productCreateCommand) {
        Product product = new Product();
        product.createFrom(productCreateCommand);
        Product newProduct = repository.save(product);
        return false;
    }
}
