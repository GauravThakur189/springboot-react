package net.springbootreactproject.sr.service;

import net.springbootreactproject.sr.model.Product;
import net.springbootreactproject.sr.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    private ProductRepository productRepository;


    @Override
    public Product saveProduct(Product product) {
        Product product1 = productRepository.save(product);
        return product1;
    }

    @Override
    public List<Product> getAllProduct() {
        List<Product> list = productRepository.findAll();
        return list;
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findById(id).get();
    }

    @Override
    public String deleteProduct(Integer id) {
     Product product = productRepository.findById(id).get();
     if(product != null){
         productRepository.delete(product);
         return "Product deleted successfully";
     }
     else{
        return "Product not found";
     }
    }
}
