package com.tia.service;

import java.util.List;

import com.tia.entity.Category;

public interface CategoryService {
	public List<Category> getList();
	public void addTwo();
	public void delete(Category category);
	public void update(Category category);
	public Category get(Integer integer);
	public void add(Category category);
}
