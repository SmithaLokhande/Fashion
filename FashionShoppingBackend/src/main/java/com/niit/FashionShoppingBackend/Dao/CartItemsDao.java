package com.niit.FashionShoppingBackend.Dao;

import java.util.List;

import com.niit.FashionShoppingBackend.model.CartItems;

public interface CartItemsDao {
	public boolean saveorupdate(CartItems cartitems);
	public boolean delete(CartItems CartItems);
	public CartItems getCartItems(String caiId);
	public List<CartItems> cailist();
	public boolean deleteCartItems(String caiId);
	public List<CartItems> getlistbyproductId(String prodId);
	public CartItems getlistall(String caiId, String prodId);
	public List<CartItems> getlist(String cartId);
}
