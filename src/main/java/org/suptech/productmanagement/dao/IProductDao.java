package org.suptech.productmanagement.dao;

import org.suptech.productmanagement.entities.Product;

public interface IProductDao {
    public void addProduct(Product product) throws Exception;
}
