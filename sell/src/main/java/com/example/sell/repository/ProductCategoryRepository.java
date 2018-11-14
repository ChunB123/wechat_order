package com.example.sell.repository;

import com.example.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author YaphetS
 * @date 2018/11/13 4:14 PM
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

}
