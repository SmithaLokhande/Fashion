//package com.niit.FashionshoppingBackend;
//
//import java.util.List;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import com.niit.FashionShoppingBackend.Dao.BillingDao;
//import com.niit.FashionShoppingBackend.Dao.OrderDao;
//import com.niit.FashionShoppingBackend.Dao.OrderItemsDao;
//import com.niit.FashionShoppingBackend.Dao.ShippingDao;
//import com.niit.FashionShoppingBackend.Dao.UserDao;
//import com.niit.FashionShoppingBackend.model.Billing;
//import com.niit.FashionShoppingBackend.model.Cart;
//import com.niit.FashionShoppingBackend.model.Order;
//import com.niit.FashionShoppingBackend.model.OrderItems;
//import com.niit.FashionShoppingBackend.model.Shipping;
//import com.niit.FashionShoppingBackend.model.User;
//
//public class OrderTest {
//	public static void main (String args[])
//
//	{
//			AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
//			ctx.scan("com.niit.*");
//			ctx.refresh();
//			OrderItems ord=(OrderItems)ctx.getBean("orderitems");
//			OrderItemsDao ordDao=(OrderItemsDao)ctx.getBean("orderitemsDao");
//			
//			ord.setOrderItemId("o11");
//		    ord.setTotalItems(2);
//		  
//			if(ordDao.saveorupdate(ord)==true)
//			{
//				System.out.println("Order is saved");
//			}
//			else
//			{
//				System.out.println("Order not saved");
//				
//			}
//			ord.setOrderItemId("o12");
//		    ord.setTotalItems(8);
//		    ord.setGrandTotal(80000.00);
//			if(ordDao.saveorupdate(ord)==true)
//			{
//				System.out.println("Order is saved");
//			}
//			else
//			{
//				System.out.println("Order not saved");
//				
//			}
//			ord.setOrderItemId("o13");
//		    ord.setTotalItems(5);
//		    ord.setGrandTotal(50000.00);
//			if(ordDao.saveorupdate(ord)==true)
//			{
//				System.out.println("Order is saved");
//			}
//			else
//			{
//				System.out.println("Order not saved");
//				
//			}
//			ord=ordDao.getOrderItems("o13");
//			if(ordDao.delete(ord)==true)
//			{
//				System.out.println("Cart deleted");
//			}
//			else
//			{
//				System.out.println("Order not deleted");
//			}
//			ord=ordDao.getOrderItems("c103");
//			if(ord==null)
//			{
//				System.out.println("Order not exists");
//			}
//			else
//			{
//				System.out.println("Order deleting...");
//				if(ordDao.delete(ord)==true)
//				{
//	            System.out.println("Order deleted");
//				}
//				{
//	            System.out.println("Order not deleted");
//				
//			}
//		}
//			
//			List<Order> orlist=ordDao.list();
//			if(orlist.isEmpty()||orlist==null)
//			{
//				System.out.println("Order not existing");
//		}
//			else
//			{
//				for(Order o:orlist)
//				{
//					System.out.println(ord.getOrderItemId());
//					
////					System.out.println(ord.getTotalItems());
////					System.out.println(ord.getGrandTotal());
//				}
//			}
//		}
//				}
//		
