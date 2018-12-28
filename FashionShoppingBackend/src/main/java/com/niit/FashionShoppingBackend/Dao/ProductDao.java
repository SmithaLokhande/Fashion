package com.niit.FashionShoppingBackend.Dao;

import java.util.List;
import com.niit.FashionShoppingBackend.model.Product;
public interface ProductDao 
{
public boolean saveorupdate(Product product);
public boolean delete(Product product);
public Product getproduct(String productId) ;
public List<Product>list();
}
