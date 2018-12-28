//package com.niit.FashionshoppingBackend;
//
//import java.util.List;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import com.niit.FashionShoppingBackend.Dao.OrderItemsDao;
//import com.niit.FashionShoppingBackend.model.OrderItems;
//
//public class OrderItemsTest {
//	public static void main (String args[])
//	{
//			AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
//			ctx.scan("com.niit.*");
//			ctx.refresh();
//			OrderItems ord=(OrderItems)ctx.getBean("orderitems");
//			OrderItemsDao ordDao=(OrderItemsDao)ctx.getBean("orderitemsDao");
//			
//			ord.setOrderItemId("o11");
//		    ord.setPrice(400.0);
//		  
//			if(ordDao.saveorupdate(ord)==true)
//			{
//				System.out.println("OrderItem is saved");
//			}
//			else
//			{
//				System.out.println("OrderItem not saved");
//				
//			}
//			ord.setOrderItemId("o12");
//		    ord.setPrice(600.0);
//			if(ordDao.saveorupdate(ord)==true)
//			{
//				System.out.println("OrderItem is saved");
//			}
//			else
//			{
//				System.out.println("OrderItem not saved");
//				
//			}
//			ord.setOrderItemId("o13");
//		    ord.setPrice(500.0);
//			if(ordDao.saveorupdate(ord)==true)
//			{
//				System.out.println("OrderItem is saved");
//			}
//			else
//			{
//				System.out.println("OrderItem not saved");
//				
//			}
//			ord=ordDao.getOrderItems("o13");
//			if(ordDao.delete(ord)==true)
//			{
//				System.out.println("OrderItem deleted");
//			}
//			else
//			{
//				System.out.println("OrderItem not deleted");
//			}
//			ord=ordDao.getOrderItems("o12");
//			if(ord==null)
//			{
//				System.out.println("OrderItem not exists");
//			}
//			else
//			{
//				System.out.println("OrderItem deleting...");
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
//			List<OrderItems> ordlist=ordDao.ordlist();
//			if(ordlist.isEmpty()||ordlist==null)
//			{
//				System.out.println("OrderItem not existing");
//		}
//			else
//			{
//				for(OrderItems o:ordlist)
//				{
//					System.out.println(ord.getOrderItemId());
//					
//					System.out.println(ord.getPrice());
//					
//				}
//			}
//		}
//				}
//	
//	
//	
//	
//	
