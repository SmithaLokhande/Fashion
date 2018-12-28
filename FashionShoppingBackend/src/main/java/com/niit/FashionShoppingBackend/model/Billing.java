package com.niit.FashionShoppingBackend.model;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class Billing {
	@Id
	private String billId;
	private String billName;
	private String billAddress;
	private String billPhno;
	
	public Billing() {
		this.billId="BILL"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userId")
	
	private User user;
	
	public User getUser() {
	return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getBillName() {
		return billName;
	}
	public void setBillName(String billName) {
		this.billName = billName;
	}
	public String getBillAddress() {
		return billAddress;
	}
	public void setBillAddress(String billAddress) {
		this.billAddress = billAddress;
	}
	public String getBillPhno() {
		return billPhno;
	}
	public void setBillPhno(String billPhno) {
		this.billPhno = billPhno;
	}
	
}

