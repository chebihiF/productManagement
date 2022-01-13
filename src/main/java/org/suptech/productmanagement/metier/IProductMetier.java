package org.suptech.productmanagement.metier;

import org.suptech.productmanagement.entities.Product;

public interface IProductMetier {
    public void addProduct(Product product) throws Exception;
}
