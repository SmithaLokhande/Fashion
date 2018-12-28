package com.niit.FashionShoppingBackend.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Cart {
	@Id
	private String cartId;
	private int TotalItems=0;
	public double GrandTotal=0;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userId")
	
	private User user;
	
	public Cart() {
		this.cartId="CART"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	@OneToMany(mappedBy="cart")
	private List<CartItems> cartItems;
	
	
	
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public Integer getTotalItems() {
		return TotalItems;
	}
	public void setTotalItems(Integer totalItems) {
		TotalItems = totalItems;
	}
	public Double getGrandTotal() {
		return GrandTotal;
	}
	public void setGrandTotal(Double grandTotal) {
		GrandTotal = grandTotal;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<CartItems> getCartItems() {
		return cartItems;
	}
	public void setCartItems(List<CartItems> cartItems) {
		this.cartItems = cartItems;
	}
	public void setTotalItems(int totalItems) {
		TotalItems = totalItems;
	}
	public void setGrandTotal(double grandTotal) {
		GrandTotal = grandTotal;
	} 

	
}
