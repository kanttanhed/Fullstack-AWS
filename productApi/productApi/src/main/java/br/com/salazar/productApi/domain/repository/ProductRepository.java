package br.com.salazar.productApi.domain.repository;

import br.com.salazar.productApi.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
