package br.com.salazar.productApi.domain.service.impl;

import br.com.salazar.productApi.domain.entity.Product;
import br.com.salazar.productApi.domain.repository.ProductRepository;
import br.com.salazar.productApi.domain.service.ProductService;

import java.util.List;

public class ProcuctServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProcuctServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        try {
            productRepository.deleteById(id);
        }catch(Exception e){
            throw new RuntimeException("It´s not possible to delete");
        }
    }
}
