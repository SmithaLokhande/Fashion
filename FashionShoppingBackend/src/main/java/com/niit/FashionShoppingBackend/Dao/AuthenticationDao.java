package com.niit.FashionShoppingBackend.Dao;

import java.util.List;

import com.niit.FashionShoppingBackend.model.Authentication;

public interface AuthenticationDao {
	public boolean saveorupdate(Authentication authentication);
	public boolean delete(Authentication authentication);
	public Authentication get(String roleId);
	public List<Authentication>list();


}
