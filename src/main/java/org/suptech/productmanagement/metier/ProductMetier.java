package org.suptech.productmanagement.metier;

import org.springframework.transaction.annotation.Transactional;
import org.suptech.productmanagement.dao.IProductDao;
import org.suptech.productmanagement.entities.Product;

public class ProductMetier implements IProductMetier{

    private IProductDao dao;

    public void setDao(IProductDao dao) {
        this.dao = dao;
    }

    @Override @Transactional
    public void addProduct(Product product) throws Exception {
        dao.addProduct(product);
    }
}
