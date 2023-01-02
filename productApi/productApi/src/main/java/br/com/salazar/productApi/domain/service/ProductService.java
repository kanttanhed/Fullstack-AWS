package br.com.salazar.productApi.domain.service;

import br.com.salazar.productApi.domain.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchAll();

    Product save(Product product);

    void delete(Long id);
}
