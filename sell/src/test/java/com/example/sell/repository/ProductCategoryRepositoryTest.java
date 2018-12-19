package com.example.sell.repository;

import com.example.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author YaphetS
 * @date 2018/11/13 4:16 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findOneTest() {
        System.out.println(productCategoryRepository.findOne(1));
    }

    @Test
    public void saveTest(){
        ProductCategory productCategory=new ProductCategory("phone",3);
        ProductCategory result=productCategoryRepository.save(productCategory);
        Assert.assertNotEquals(null,result);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> productCategoryTypes= Arrays.asList(1,2,3);
        List<ProductCategory> productCategories=productCategoryRepository.findByCategoryTypeIn(productCategoryTypes);

        //List<ProductCategory> productCategories=productCategoryRepository.findProductCategoriesByCategoryTypeIn(productCategoryTypes);

        Assert.assertNotEquals(3,productCategories.size());
    }
}