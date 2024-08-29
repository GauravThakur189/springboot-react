package net.springbootreactproject.sr.service;

import net.springbootreactproject.sr.model.Product;

import java.util.List;

public interface ProductService {

    public Product saveProduct(Product product);

    public List<Product> getAllProduct();

    public  Product getProductById(Integer id);

    public String deleteProduct(Integer id);
}
