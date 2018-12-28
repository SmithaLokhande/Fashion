package com.niit.FashionshoppingBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.FashionShoppingBackend.Dao.SupplierDao;
import com.niit.FashionShoppingBackend.model.Supplier;

public class SupplierTest {

	public static void main(String args[])
			{
	//			Supplier sup=new Supplier();
	//			sup.setSupId("s101");
	//			sup.setSupName("supplier1");
	//			System.out.println("SupId:"+ sup.getSuppId());
	//			System.out.println("SupName:"+sup.getSuppName());
				
				
				AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
				ctx.scan("com.niit.*");
				ctx.refresh();
			    Supplier Supp=(Supplier)ctx.getBean("supplier");
				SupplierDao SuppDao=(SupplierDao)ctx.getBean("supplierDao");
				
				Supp.setSuppName("Supplier1");
				if(SuppDao.saveorupdate(Supp)==true)
				{
					System.out.println("Supplier is saved");
				}
				else
				{
					System.out.println("Supplier not saved");
					
				}
				Supp.setSuppId("s102");
				Supp.setSuppName("Supplier1");
				if(SuppDao.saveorupdate(Supp)==true)
				{
					System.out.println("Supplier is saved");
				}
				else
				{
					System.out.println("Supplier not saved");
					
				}
				Supp.setSuppId("s103");
				Supp.setSuppName("supplier1");
				if(SuppDao.saveorupdate(Supp)==true)
				{
					System.out.println("Supplier is saved");
				}
				else
				{
					System.out.println("Supplier not saved");
					
				}
				Supp=SuppDao.getsupplier("S101");
				if(Supp==null)
				{
					System.out.println("Supplier not exists");
				}
				else
				{
					System.out.println("Supplier exists");
	                System.out.println(Supp.getSuppId());
	                
	                System.out.println(Supp.getSuppName());
					
				}
				Supp=SuppDao.getsupplier("S103");
				if(Supp==null)
				{
					System.out.println("Supplier not exists");
				}
				else
				{
					System.out.println("Category deleting...");
					if(SuppDao.delete(Supp)==true)
					{
	                System.out.println("Supplier deleted");
					}
					{
	                System.out.println("Supplier not deleted");
					
				}
			}
				List<Supplier> supplist=SuppDao.list();
				if(supplist.isEmpty()||supplist==null)
				{
					System.out.println("Supplier not existing");
				}
				else
				{
					for(Supplier S:supplist)
					{
						System.out.println(S.getSuppId());
						
						System.out.println(S.getSuppName());
					}
				}
				ctx.close();
				
					}
				
	
}
	
	


