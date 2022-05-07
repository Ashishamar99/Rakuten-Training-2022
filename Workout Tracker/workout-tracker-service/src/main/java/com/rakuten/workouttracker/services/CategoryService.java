package com.rakuten.workouttracker.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.workouttracker.entities.Category;
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
}
