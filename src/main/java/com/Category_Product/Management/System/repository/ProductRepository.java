package com.Category_Product.Management.System.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Category_Product.Management.System.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
