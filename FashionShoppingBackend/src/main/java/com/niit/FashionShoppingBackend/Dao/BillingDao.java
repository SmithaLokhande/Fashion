package com.niit.FashionShoppingBackend.Dao;

import java.util.List;

import com.niit.FashionShoppingBackend.model.Billing;


public interface BillingDao {
	
	public boolean saveorupdate(Billing billing);
	public boolean delete(Billing billing);
	public Billing getbilling(String UserId);
	public List<Billing>list();

}
