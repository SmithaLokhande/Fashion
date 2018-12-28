package com.niit.FashionshoppingBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.FashionShoppingBackend.Dao.PaymentDao;
import com.niit.FashionShoppingBackend.model.Payment;

public class PaymentTest {
	public static void main(String args[])
	{
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		Payment pay=(Payment)ctx.getBean("payment");
		PaymentDao payDao=(PaymentDao)ctx.getBean("paymentDao");
		
		pay.setPayId("p101");
	    pay.setMethod("one");
	    pay.setStatus("56");
		if(payDao.saveorupdate(pay)==true)
		{
			System.out.println("Payment is saved");
		}
		else
		{
			System.out.println("Payment not saved");
			
		}
		pay.setPayId("p104");
	    pay.setMethod("two");
	    pay.setStatus("58");
		if(payDao.saveorupdate(pay)==true)
		{
			System.out.println("Payment is saved");
		}
		else
		{
			System.out.println("Payment not saved");
			
			
		}
		pay.setPayId("p105");
	    pay.setMethod("six");
	    pay.setStatus("58");
		if(payDao.saveorupdate(pay)==true)
		{
			System.out.println("Payment is saved");
		}
		else
		{
			System.out.println("Payment not saved");
			
			
		}
		pay=payDao.getPayment("c101");
		if(pay==null)
		{
			System.out.println("Payment not exists");
		}
		else
		{
			System.out.println("Payment exists");
            System.out.println(pay.getPayId());
            System.out.println(pay.getMethod());
            System.out.println(pay.getStatus());
	}
		
		pay=payDao.getPayment("p103");
		if(pay==null)
		{
			System.out.println("Product not exists");
		}
		else
		{
			System.out.println("Product deleting...");
			if(payDao.delete(pay)==true)
			{
            System.out.println("Payment deleted");
			}
			{
            System.out.println("Payment not deleted");
			
		}
	}
		
		List<Payment> paylist=payDao.paylist();
		if(paylist.isEmpty()||paylist==null)
		{
			System.out.println("Payment not existing");
	}
		else
		{
			for(Payment p:paylist)
			{
				  System.out.println(pay.getPayId());
		          System.out.println(pay.getMethod());
		          System.out.println(pay.getStatus());
			}
		}
		ctx.close();
		
			}
		}

