package net.springbootreactproject.sr.repository;

import net.springbootreactproject.sr.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
