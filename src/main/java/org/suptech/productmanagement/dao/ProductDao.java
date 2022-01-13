package org.suptech.productmanagement.dao;

import org.suptech.productmanagement.entities.Product;

import javax.persistence.EntityManager;

public class ProductDao implements IProductDao{

    private final EntityManager em ;

    public ProductDao(EntityManager em) {
        this.em = em;
    }

    @Override
    public void addProduct(Product product) throws Exception {
        em.persist(product);
    }
}
