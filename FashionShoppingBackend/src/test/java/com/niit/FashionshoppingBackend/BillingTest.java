package com.niit.FashionshoppingBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.FashionShoppingBackend.Dao.BillingDao;
import com.niit.FashionShoppingBackend.model.Billing;

public class BillingTest {
	
	public static void main(String args[])
	{
//		Billing bill=new Billing();
//		bill.setBillId("b101");
//		bill.setBillName("billing1");
//		System.out.println("BillId:"+ bill.getBillId());
//		System.out.println("BillName:"+bill.getBillName());
		
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		Billing bill=(Billing)ctx.getBean("billing");
		BillingDao billDao=(BillingDao)ctx.getBean("billingDao");
		
		bill.setBillId("b101");
		bill.setBillName("billing1");
		if(billDao.saveorupdate(bill)==true)
		{
			System.out.println("Billing is saved");
		}
		else
		{
			System.out.println("Billing not saved");
			
		}
		bill.setBillId("b102");
		bill.setBillName("Billing1");
		if(billDao.saveorupdate(bill)==true)
		{
			System.out.println("Billing is saved");
		}
		else
		{
			System.out.println("Billing not saved");
			
		}
		bill.setBillId("b103");
		bill.setBillName("Billing1");
		if(billDao.saveorupdate(bill)==true)
		{
			System.out.println("Billing is saved");
		}
		else
		{
			System.out.println("Billing not saved");
			
		}
		bill=billDao.getbilling("b101");
		if(bill==null)
		{
			System.out.println("Billing not exists");
		}
		else
		{
			System.out.println("Billing exists");
            System.out.println(bill.getBillId());
            
            System.out.println(bill.getBillName());
			
		}
		bill=billDao.getbilling("b103");
		if(bill==null)
		{
			System.out.println("Billing not exists");
		}
		else
		{
			System.out.println("Billing deleting...");
			if(billDao.delete(bill)==true)
			{
            System.out.println("Billing deleted");
			}
			{
            System.out.println("Billing not deleted");
			
		}
	}
		
		List<Billing> billlist=billDao.list();
		if(billlist.isEmpty()||billlist==null)
		{
			System.out.println("Billing not existing");
		}
		else
		{
			for(Billing b:billlist)
			{
				System.out.println(b.getBillId());
				
				System.out.println(b.getBillName());
			}
		}
		ctx.close();
		
			}
		}

