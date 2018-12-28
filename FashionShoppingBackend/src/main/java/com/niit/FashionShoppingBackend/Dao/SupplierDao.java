package com.niit.FashionShoppingBackend.Dao;

import java.util.List;

import com.niit.FashionShoppingBackend.model.Supplier;

public interface SupplierDao 
{
	public boolean saveorupdate(Supplier supplier);
	public boolean delete(Supplier supplier);
	public Supplier getsupplier(String supplierId);
	public List<Supplier> list();

}
