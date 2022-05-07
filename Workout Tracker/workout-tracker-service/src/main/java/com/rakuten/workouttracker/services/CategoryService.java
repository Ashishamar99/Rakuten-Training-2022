package com.rakuten.workouttracker.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rakuten.workouttracker.entities.Category;

@Service
public class CategoryService {
	
	static List<Category> categories = new ArrayList<>();

	public List<Category> fetchAllCategories() {
		return categories;
	}

	public void addCategory(Category category) {
		categories.add(category);
		
	}
	
}
