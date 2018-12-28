package com.niit.FashionShoppingBackend.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Supplier
{
	@Id
	private String SuppId;
	private String SuppName;
	private String SuppAddress;
	private String PhNumber;
	
	public Supplier() {
		this.SuppId="SSUP"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	public String getSuppId() {
		return SuppId;
	}
	public void setSuppId(String suppId) {
		SuppId = suppId;
	}
	public String getSuppName() {
		return SuppName;
	}
	public void setSuppName(String suppName) {
		SuppName = suppName;
	}
	public String getSuppAddress() {
		return SuppAddress;
	}
	public void setSuppAddress(String suppAddress) {
		SuppAddress = suppAddress;
	}
	public String getPhNumber() {
		return PhNumber;
	}
	public void setPhNumber(String phNumber) {
		PhNumber = phNumber;
	}

}
