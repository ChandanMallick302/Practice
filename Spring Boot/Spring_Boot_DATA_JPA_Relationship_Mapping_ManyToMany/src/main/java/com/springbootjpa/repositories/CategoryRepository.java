package com.springbootjpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springbootjpa.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

	public List<Category> findByCategoryName(String name);
	
	@Query("select c from Category c where c.categoryName=:name")
	public List<Category> selectCategoryName(@Param("name") String name);
}
