package com.productcrud.dao;

import com.productcrud.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ProductDao {
    @Autowired
    private HibernateTemplate template;

    @Transactional
    public void createProduct(Product product) {
        this.template.saveOrUpdate(product);
    }

    public List<Product> getAllProducts() {
        List<Product> products = this.template.loadAll(Product.class);
        return products;
    }

    @Transactional
    public void deleteSingleProduct(int pId) {
        Product p = this.template.load(Product.class, pId);
        this.template.delete(p);
    }

    public Product getSingleProduct(int pId) {
        return this.template.get(Product.class, pId);
    }
}
