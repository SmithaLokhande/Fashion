package com.niit.FashionShoppingBackend.Dao;

import java.util.List;

import com.niit.FashionShoppingBackend.model.Category;

public interface CategoryDao 
{
public boolean saveorupdate(Category category);
public boolean delete(Category category);
public Category getCategory(String catId);
public List<Category> catlist();
}
