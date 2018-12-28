package com.niit.FashionshoppingBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.FashionShoppingBackend.Dao.CartDao;
import com.niit.FashionShoppingBackend.model.Cart;
public class CartTest {
	
	public static void main(String args[])
	
	{
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		Cart cart=(Cart)ctx.getBean("cart");
		CartDao cartDao=(CartDao)ctx.getBean("cartDao");
		
		cart.setCartId("c11");
	    cart.setTotalItems(2);
	    cart.setGrandTotal(50000.00);
		if(cartDao.saveorupdate(cart)==true)
		{
			System.out.println("Cart is saved");
		}
		else
		{
			System.out.println("Cart not saved");
			
		}
		cart.setCartId("c12");
	    cart.setTotalItems(2);
	    cart.setGrandTotal(80000.00);
		if(cartDao.saveorupdate(cart)==true)
		{
			System.out.println("Cart is saved");
		}
		else
		{
			System.out.println("Cart not saved");
			
			
		}
		cart.setCartId("c13");
	    cart.setTotalItems(2);
	    cart.setGrandTotal(90000.00);
		if(cartDao.saveorupdate(cart)==true)
		{
			System.out.println("Cart is saved");
		}
		else
		{
			System.out.println("Cart not saved");
			
			
		}
		cart=cartDao.getCart("c101");
		if(cartDao.delete(cart)==true)
		{
			System.out.println("Cart deleted");
		}
		else
		{
			System.out.println("Cart not deleted");
		}
		cart=cartDao.getCart("c103");
		if(cart==null)
		{
			System.out.println("Cart not exists");
		}
		else
		{
			System.out.println("Cart deleting...");
			if(cartDao.delete(cart)==true)
			{
            System.out.println("Cart deleted");
			}
			{
            System.out.println("Cart not deleted");
			
		}
	}
		
		List<Cart> carlist=cartDao.carlist();
		if(carlist.isEmpty()||carlist==null)
		{
			System.out.println("Cart not existing");
	}
		else
		{
			for(Cart c:carlist)
			{
				System.out.println(c.getCartId());
				
				System.out.println(c.getTotalItems());
				System.out.println(c.getGrandTotal());
			}
		}
	}
			}
	


