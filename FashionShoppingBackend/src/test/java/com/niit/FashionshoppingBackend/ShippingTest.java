package com.niit.FashionshoppingBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.FashionShoppingBackend.Dao.ShippingDao;
import com.niit.FashionShoppingBackend.model.Shipping;

public class ShippingTest {
	public static void main(String args[])
	{
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.*");
	ctx.refresh();
	Shipping shipp=(Shipping)ctx.getBean("shipping");
	ShippingDao shippDao=(ShippingDao)ctx.getBean("shippingDao");
	
	shipp.setShipId("s101");
	shipp.setShipName("shipping1");
	if(shippDao.saveorupdate(shipp)==true)
	{
		System.out.println("Shipping is saved");
	}
	else
	{
		System.out.println("Shipping not saved");
		
	}
	shipp.setShipId("s102");
	shipp.setShipName("shipping1");
	if(shippDao.saveorupdate(shipp)==true)
	{
		System.out.println("Shipping is saved");
	}
	else
	{
		System.out.println("Shipping not saved");
		
	}
	shipp.setShipId("s103");
	shipp.setShipName("shipping1");
	if(shippDao.saveorupdate(shipp)==true)
	{
		System.out.println("Shipping is saved");
	}
	else
	{
		System.out.println("Shipping not saved");
		
	}
	shipp=shippDao.getshipping("s101");
	if(shipp==null)
	{
		System.out.println("Shipping not exists");
	}
	else
	{
		System.out.println("Shipping exists");
        System.out.println(shipp.getShipId());
        
        System.out.println(shipp.getShipName());
		
	}
	shipp=shippDao.getshipping("s103");
	if(shipp==null)
	{
		System.out.println("Shipping not exists");
	}
	else
	{
		System.out.println("Shipping deleting...");
		if(shippDao.delete(shipp)==true)
		{
        System.out.println("Shipping deleted");
		}
		{
        System.out.println("Shipping not deleted");
		
	}
}
	
	List<Shipping> shipplist=shippDao.list();
	if(shipplist.isEmpty()||shipplist==null)
	{
		System.out.println("Shipping not existing");
	}
	else
	{
		for(Shipping s:shipplist)
		{
			System.out.println(s.getShipId());

			System.out.println(s.getShipName());
		}
	}
	ctx.close();
	
		}
	
}

