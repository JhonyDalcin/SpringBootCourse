package br.com.digisolutions.productsapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//When the entity name is different from database table should have the annotation @Table(name = 'table_name')
public class Product {

    //if the attribute name is different from databse column name it's necessary to add, the annotation @Column(name = database column name) over the attribute.
    @Id
    private String id;
    private String name;
    private String description;
    private Double price;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
    }

    

}
