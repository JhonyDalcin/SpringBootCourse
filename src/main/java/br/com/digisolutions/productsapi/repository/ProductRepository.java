package br.com.digisolutions.productsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.digisolutions.productsapi.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
}
