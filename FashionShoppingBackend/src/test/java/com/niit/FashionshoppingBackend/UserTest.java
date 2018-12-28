package com.niit.FashionshoppingBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.FashionShoppingBackend.Dao.UserDao;
import com.niit.FashionShoppingBackend.model.User;

public class UserTest {
	public static void main(String args[])
	{
	
//			User use=new User();
//			use.setUseId("u101");
//			use.setUseName("User1");
//			System.out.println("UseId:"+ use.getUseId());
//			System.out.println("UseName:"+use.getUseName());
			
			
			AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
			ctx.scan("com.niit.*");
			ctx.refresh();
			User use=(User)ctx.getBean("user");
			UserDao useDao=(UserDao)ctx.getBean("userDao");
			
			use.setUserId("u101");
			use.setUserName("user1");
			if(useDao.saveorupdate(use)==true)
			{
				System.out.println("User is saved");
			}
			else
			{
				System.out.println("User not saved");
				
			}
			use.setUserId("u102");
			use.setUserName("user1");
			if(useDao.saveorupdate(use)==true)
			{
				System.out.println("User is saved");
			}
			else
			{
				System.out.println("User not saved");
				
			}
			use.setUserId("c103");
			use.setUserName("user1");
			if(useDao.saveorupdate(use)==true)
			{
				System.out.println("User is saved");
			}
			else
			{
				System.out.println("User not saved");
				
			}
			use=useDao.getUser("u101");
			if(use==null)
			{
				System.out.println("User not exists");
			}
			else
			{
				System.out.println("User exists");
                System.out.println(use.getUserId());
                
                System.out.println(use.getUserName());
				
			}
			use=useDao.getUser("c103");
			if(use==null)
			{
				System.out.println("Category not exists");
			}
			else
			{
				System.out.println("Category deleting...");
				if(useDao.delete(use)==true)
				{
                System.out.println("User deleted");
				}
				{
                System.out.println("User not deleted");
				
			}
		}
			
			List<User> uselist=useDao.list();
			if(uselist.isEmpty()||uselist==null)
			{
				System.out.println("User not existing");
			}
			else
			{
				for(User u:uselist)
				{
					System.out.println(u.getUserId());
					
					System.out.println(u.getUserName());
				}
			}
			ctx.close();
			
				}
			
}
	