package org.suptech.productmanagement.web;

import org.springframework.stereotype.Controller;
import org.suptech.productmanagement.entities.Product;
import org.suptech.productmanagement.metier.IProductMetier;

@Controller
public class ProductController {

    private final IProductMetier metier;

    public ProductController(IProductMetier metier) {
        this.metier = metier;
    }

    public String addProduct(Product product) {
        try {
            metier.addProduct(product);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "products";
    }

}
