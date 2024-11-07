package br.com.digisolutions.productsapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.digisolutions.productsapi.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

    List<Product> findByName(String name);

}
