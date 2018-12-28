package com.niit.FashionShoppingBackend.Dao;

import java.util.List;

import com.niit.FashionShoppingBackend.model.Cart;

public interface CartDao {
	public boolean saveorupdate(Cart cart);
	public boolean delete(Cart Cart);
	public Cart getCart(String carId);
	public List<Cart> carlist();
}
