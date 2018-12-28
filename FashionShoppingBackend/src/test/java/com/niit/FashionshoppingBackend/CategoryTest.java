//package com.niit.FashionshoppingBackend;
//
//import java.util.List;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.niit.FashionShoppingBackend.Dao.CategoryDao;
//import com.niit.FashionShoppingBackend.model.Category;
//
//
//public class CategoryTest {
//
//
//		public static void main(String args[])
//		{
////			Category cat=new Category();
////			cat.setCatId("c101");
////			cat.setCatName("category1");
////			System.out.println("CatId:"+ cat.getCatId());
////			System.out.println("CatName:"+cat.getCatName());
//			
//			
//			AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
//			ctx.scan("com.niit.*");
//			ctx.refresh();
//		    Category cat=(Category)ctx.getBean("category");
//			CategoryDao catDao=(CategoryDao)ctx.getBean("categoryDao");
//			
//			cat.setCatId("c101");
//			cat.setCatName("category1");
//			if(catDao.saveorupdate(cat)==true)
//			{
//				System.out.println("Category is saved");
//			}
//			else
//			{
//				System.out.println("Category not saved");
//				
//			}
//			cat.setCatId("c102");
//			cat.setCatName("category1");
//			if(catDao.saveorupdate(cat)==true)
//			{
//				System.out.println("Category is saved");
//			}
//			else
//			{
//				System.out.println("Category not saved");
//				
//			}
//			cat.setCatId("c103");
//			cat.setCatName("category1");
//			if(catDao.saveorupdate(cat)==true)
//			{
//				System.out.println("Category is saved");
//			}
//			else
//			{
//				System.out.println("Category not saved");
//				
//			}
//			cat=catDao.Category("c101");
//			if(cat==null)
//			{
//				System.out.println("Category not exists");
//			}
//			else
//			{
//				System.out.println("Category exists");
//                System.out.println(cat.getCatId());
//                
//                System.out.println(cat.getCatName());
//				
//			}
//			cat=catDao.Category("c103");
//			if(cat==null)
//			{
//				System.out.println("Category not exists");
//			}
//			else
//			{
//				System.out.println("Category deleting...");
//				if(catDao.delete(cat)==true)
//				{
//                System.out.println("Category deleted");
//				}
//				{
//                System.out.println("Category not deleted");
//				
//			}
//		}
//			
//			List<Category> catlist=catDao.catlist();
//			if(catlist.isEmpty()||catlist==null)
//			{
//				System.out.println("Categories not existing");
//			}
//			else
//			{
//				for(Category c:catlist)
//				{
//					System.out.println(c.getCatId());
//					
//					System.out.println(c.getCatName());
//				}
//			}
//			ctx.close();
//			
//				}
//			}
//
//
//
