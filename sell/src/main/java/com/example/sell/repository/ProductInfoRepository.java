package com.example.sell.repository;

import com.example.sell.dataobject.ProductCategory;
import com.example.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author YaphetS
 * @date 2018/11/15
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
