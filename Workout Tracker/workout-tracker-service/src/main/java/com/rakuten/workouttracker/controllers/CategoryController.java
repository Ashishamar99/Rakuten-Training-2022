package com.rakuten.workouttracker.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.workouttracker.entities.Category;
import com.rakuten.workouttracker.entities.Workout;
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
	
	@PutMapping("/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	void updateCategoryById(@PathVariable Integer id, @RequestBody Category category) {
		categoryService.updateCategoryFromId(id, category);
	}
	
	@GetMapping("/{id}")
	Optional<Category> getCategoryById(@PathVariable Integer id) {
		return categoryService.fetchCategoryById(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	void removeCategoryById(@PathVariable Integer id) {
		categoryService.deleteCategoryById(id);
	}
	
	@ExceptionHandler(EmptyResultDataAccessException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	void handleDeleteInvalidCategory() { }

}
