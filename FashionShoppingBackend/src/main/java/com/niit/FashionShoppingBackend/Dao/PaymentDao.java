package com.niit.FashionShoppingBackend.Dao;

import java.util.List;
import com.niit.FashionShoppingBackend.model.Payment;

public interface PaymentDao {
	public boolean saveorupdate(Payment payment);
	public boolean delete(Payment payment);
	public Payment getPayment(String payId);
	public List<Payment> paylist();
}
