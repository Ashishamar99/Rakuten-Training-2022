package com.rakuten.workouttracker.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.workouttracker.entities.Category;
import com.rakuten.workouttracker.services.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping
	List<Category> getAllCategories() {
		return categoryService.fetchAllCategories();
	}
	
	@PostMapping
	void saveCategory(@RequestBody Category category) {
		categoryService.addCategory(category);
	}
	
	@PostMapping("/saveMultipleCategoriesAtOnce")
	void saveCategories(@RequestBody List<Category> listOfCategories) {
		categoryService.addMultipleCategories(listOfCategories);
	}

}
