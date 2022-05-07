package com.rakuten.workouttracker.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.workouttracker.entities.Category;
import com.rakuten.workouttracker.entities.Workout;
import com.rakuten.workouttracker.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public static List<String> categoriesList;

	public List<Category> fetchAllCategories() {
		return categoryRepository.findAll();
	}

	public void addCategory(Category category) {
		categoryRepository.save(category);
		
	}

	public void addMultipleCategories(List<Category> listOfCategories) {
		listOfCategories.forEach(category -> categoryRepository.save(category));
		
	}

	public void updateCategoryFromId(Integer id, Category category) {
		category.setId(id);
		categoryRepository.save(category);
		
	}

	public Optional<Category> fetchCategoryById(Integer id) {
		return categoryRepository.findById(id);
	}

	public void deleteCategoryById(Integer id) {
		categoryRepository.deleteById(id);
		
	}
}
