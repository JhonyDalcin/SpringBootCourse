package br.com.digisolutions.productsapi.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.digisolutions.productsapi.model.Product;
import br.com.digisolutions.productsapi.repository.ProductRepository;

@RestController
@RequestMapping("products")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product save(@RequestBody Product product){
        
        var id = UUID.randomUUID().toString();
        product.setId(id);

        productRepository.save(product);
        System.out.println("Product: " + product);
        return product;
    }

    @GetMapping("{id}")
    public Product getProductById(@PathVariable("id") String id) {
//      Optional<Product> product = productRepository.findById(id);
//      return product.isPresent() ? product.get() :null;
        return productRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") String id){
        productRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public void update(@PathVariable("id") String id, 
                        @RequestBody Product product){
        
        product.setId(id);
        productRepository.save(product);

    }

    @GetMapping
    public List<Product> buscar(@RequestParam("name") String name){
        return productRepository.findByName(name);
    }

}
