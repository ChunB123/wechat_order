package com.example.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author YaphetS
 * @date 2018/11/13 4:11 PM
 */
@Entity
@Data
public class ProductCategory {
	/** 类目id. */
	@Id
	@GeneratedValue
	private Integer categoryId;

	/** 类目名字. */
	private String categoryName;

	/** 类目编号. */
	private Integer categoryType;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
