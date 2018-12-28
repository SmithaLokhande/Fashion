package com.niit.FashionshoppingBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.FashionShoppingBackend.Dao.ProductDao;
import com.niit.FashionShoppingBackend.model.Product;

public class ProductTest {

	public static void main(String args[])
			{
	//			Product pro=new Product();
	//			pro.setProId("p101");
	//			pro.setProName("product1");
	//			System.out.println("ProId:"+ pro.getProId());
	//			System.out.println("ProName:"+pro.getProName());
				
				
				AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
				ctx.scan("com.niit.*");
				ctx.refresh();
			    Product pro=(Product)ctx.getBean("product");
				ProductDao proDao=(ProductDao)ctx.getBean("productDao");
				
				pro.setProductId("p101");
			    pro.setProductName("product1");
				if(proDao.saveorupdate(pro)==true)
				{
					System.out.println("Product is saved");
				}
				else
				{
					System.out.println("Product not saved");
					
				}
				pro.setProductId("p102");
			    pro.setProductName("product1");
				if(proDao.saveorupdate(pro)==true)
				{
					System.out.println("Product is saved");
				}
				else
				{
					System.out.println("Product not saved");
					
					
				}
				pro.setProductId("p103");
			    pro.setProductName("product1");
				if(proDao.saveorupdate(pro)==true)
				{
					System.out.println("Product is saved");
				}
				else
				{
					System.out.println("Product not saved");
					
					
				}
				pro=proDao.getproduct("c101");
				if(pro==null)
				{
					System.out.println("Product not exists");
				}
				else
				{
					System.out.println("Product exists");
	                System.out.println(pro.getProductId());
	                
	                System.out.println(pro.getProductName());
			}
				
				pro=proDao.getproduct("p103");
				if(pro==null)
				{
					System.out.println("Product not exists");
				}
				else
				{
					System.out.println("Product deleting...");
					if(proDao.delete(pro)==true)
					{
	                System.out.println("Product deleted");
					}
					{
	                System.out.println("Product not deleted");
					
				}
			}
				
				List<Product> prolist=proDao.list();
				if(prolist.isEmpty()||prolist==null)
				{
					System.out.println("Product not existing");
			}
				else
				{
					for(Product p:prolist)
					{
						System.out.println(p.getProductId());
						
						System.out.println(p.getProductName());
					}
				}
				ctx.close();
				
					}
				}
	

