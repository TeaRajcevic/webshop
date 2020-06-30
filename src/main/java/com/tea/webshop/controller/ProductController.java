package com.tea.webshop.controller;

import com.tea.webshop.model.Product;
import com.tea.webshop.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ProductController {


    @GetMapping("/products")
    public Product getProduct(@RequestParam(value = "name", defaultValue = "Car") String name,
                              @RequestParam(value = "description", defaultValue = "new") String description,
                              @RequestParam(value = "price", defaultValue = "10000") int price) {
        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);

        return product;
    }

     @PostMapping("/products")
     public Product postProduct(Product product){
       System.out.println("Product name:" + product.getName());
     return product;}
}
