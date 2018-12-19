package com.example.sell.service;

import com.example.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @author YaphetS
 * @date 2018/11/14
 */
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> productCategoryTypes);

    ProductCategory save(ProductCategory productCategory);
}
