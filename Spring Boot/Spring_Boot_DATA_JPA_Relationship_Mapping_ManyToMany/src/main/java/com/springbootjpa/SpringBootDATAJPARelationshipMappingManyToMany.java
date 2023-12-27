package com.springbootjpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootjpa.entities.Category;
import com.springbootjpa.entities.Product;
import com.springbootjpa.repositories.CategoryRepository;
import com.springbootjpa.repositories.ProductRepository;

@SpringBootApplication
public class SpringBootDATAJPARelationshipMappingManyToMany implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDATAJPARelationshipMappingManyToMany.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Category c1=new Category();
//		c1.setCategoryName("Electronics");
//		
//		Category c2=new Category();
//		c2.setCategoryName("Mobile");
//		
//		Product p1=new Product();
//		p1.setProductName("Iphone 15");
//		
//		Product p2=new Product();
//		p2.setProductName("Red Me 13 pro max");
//		
//		
//		Product p3=new Product();
//		p3.setProductName("Tv");
//		
//		List prodMobList=Arrays.asList(p1,p2);
//		List prodTvList=Arrays.asList(p3);
//		
//		List CatElecList=Arrays.asList(c1);
//		List CatMobList=Arrays.asList(c2);
//		
//		
//		p1.setCategories(CatMobList);
//		p2.setCategories(CatMobList);
//		p3.setCategories(CatElecList);
//		
//		c1.setProduct(prodTvList);
//		c2.setProduct(prodMobList);
//		
//		productRepository.saveAll(prodMobList);
//		productRepository.saveAll(prodTvList);
//		
//		System.out.println("Successfully saved");

		// selectByProduct
		List<Product> findAll = productRepository.findAll();
		findAll.forEach(e -> {
			System.out.println(e.getProductName());
			e.getCategories().forEach(x -> {
				System.out.println(x.getCategoryName());
			});
		});

		// selectByCategory findbymethod
		List<Category> findbyName = categoryRepository.findByCategoryName("Electronics");
		findbyName.forEach(e -> {
			System.out.println(e.getCategoryName());
			e.getProduct().forEach(x -> {
				System.out.println(x.getProductName());
			});
		});

		// selectByCategory name-parameter query method
		List<Category> selectCategoryName = categoryRepository.selectCategoryName("Mobile");
		selectCategoryName.forEach(e -> {
			System.out.println(e.getCategoryName());
			e.getProduct().forEach(x -> {
				System.out.println(x.getProductName());
			});
		});
	}
}