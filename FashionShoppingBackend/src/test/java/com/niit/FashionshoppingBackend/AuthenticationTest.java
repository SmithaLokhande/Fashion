//package com.niit.FashionshoppingBackend;
//
//import java.util.List;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.niit.FashionShoppingBackend.Dao.AuthenticationDao;
//import com.niit.FashionShoppingBackend.model.Authentication;
//public class AuthenticationTest {
//	public static void main(String args[])
//	{
//	Authentication auth=new Authentication();
//	
//	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
//	ctx.scan("com.niit.*");
//	ctx.refresh();
//	Authentication Auth=(Authentication)ctx.getBean("Authentication");
//	AuthenticationDao authDao=(AuthenticationDao)ctx.getBean("AuthenticationDao");
//	
//	auth.setRoleId("a101");
//	auth.setRoleName("authentication1");
//	auth.setUserName("123");
//	if(authDao.saveorupdateAunthetication(auth)==true)
//	{
//		System.out.println("authentication is saved");
//	}
//	else
//	{
//		System.out.println("authentication not saved");
//		
//	}
//	auth.setRoleId("a103");
//	auth.setRoleName("authentication3");
//	auth.setUserName("789");
//	if(authDao.saveorupdateAunthetication(auth)==true)
//	{
//		System.out.println("authentication is saved");
//	}
//	else
//	{
//		System.out.println("authentication not saved");
//		
//	}
//	
//	auth=authDao.getAuthentication("a101");
//	if(authDao.deleteAuthentication(auth)==true)
//	{
//		System.out.println("authentication deleted");
//	}
//	else
//	{
//		System.out.println("authentication not deleted");
//	}
//	auth=authDao.getAuthentication("a102");
//	if(auth==null)
//	{
//		System.out.println("authentication is not found");
//	}
//	else
//	{
//		System.out.println(auth.getRoleId());
//		System.out.println(auth.getRoleName());
//		System.out.println(auth.getUserName());
//	}
//	List<Authentication>authlist=authDao.list();
//	if(authlist.isEmpty()||authlist==null)
//	{
//		System.out.println("authentication is empty");
//	}
//	else
//	{
//		for(Authentication a:authlist)
//		{System.out.println(auth.getRoleId());
//		System.out.println(auth.getRoleName());
//		System.out.println(auth.getUserName());
//		}
//	}
//	ctx.close();
//	
//		}
//	
//}
//
