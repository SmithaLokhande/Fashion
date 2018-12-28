package com.niit.FashionShoppingBackend.model;

import javax.persistence.Transient;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Entity
@Table
@Component
public class Product 
{
	@Id
	private String ProductId;
	private String ProductName;
	private Double Prize;
	private String QuantityInt;
	private String Description;
	
    @Transient
	private MultipartFile ping;
	
	public MultipartFile getPing() {
		return ping;
	}

	public void setPing(MultipartFile ping) {
		this.ping = ping;
	}

	public Product() {
		this.ProductId="PRO"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	@ManyToOne
	@JoinColumn(name="catId")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name="supId")
	private Supplier supplier;
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}

	
	public String getProductId() {
		return ProductId;
	}
	public void setProductId(String productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	
	public Double getPrize() {
		return Prize;
	}

	public void setPrize(Double prize) {
		Prize = prize;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public String getQuantityInt() {
		return QuantityInt;
	}
	public void setQuantityInt(String quantityInt) {
		QuantityInt = quantityInt;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
}
