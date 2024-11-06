package br.com.digisolutions.productsapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.digisolutions.productsapi.model.Product;

@RestController
@RequestMapping("products")
public class ProductController {

    @PostMapping
    public Product save(@RequestBody Product product){
        System.out.println("Product: " + product);
        return product;
    }

}
