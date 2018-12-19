package com.example.sell;

import com.example.sell.dataobject.Person;
import com.example.sell.dataobject.ProductInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author YaphetS
 * @date 2018/11/13 3:21 PM
 */
@SpringBootApplication
public class SellApplication {

	public static void main(String[] args) {
		SpringApplication.run(SellApplication.class, args);
		Person person=new Person();
		Person person1=new Person();

	}
}
