package com.niit.FashionShoppingBackend.Dao;

import java.util.List;

import com.niit.FashionShoppingBackend.model.Shipping;

public interface ShippingDao {
	public boolean saveorupdate(Shipping shipping);
	public boolean delete(Shipping shipping);
	public Shipping getshipping(String shippingId);
	public List<Shipping>list();
	public List<Shipping> getaddbyuser(String userId);

}
