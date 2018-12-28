package com.niit.FashionShoppingFrontend1.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.FashionShoppingBackend.Dao.UserDao;
import com.niit.FashionShoppingBackend.model.Cart;
import com.niit.FashionShoppingBackend.model.User;

public class UserController {

	@Autowired
	User user;
	@Autowired
	UserDao userDao;
	
	@RequestMapping("/User")
	public ModelAndView userform()
	{
		List<User> users=userDao.list();
		ModelAndView obj=new ModelAndView("User");
		obj.addObject("user", new User());
		obj.addObject("users", users);
		return obj;
	}
	
	@RequestMapping(value="/adduser",method=RequestMethod.POST)
	public ModelAndView adduser(@ModelAttribute("user")User user)
	{
		ModelAndView obj= new ModelAndView("redirect:/User");
		//CategoryDao.saveorupdate(Category);
		obj.addObject("echo", "Category is added successfully");
		Cart c= new Cart();
	    //c.user.setCart(c);
		if(userDao.saveorupdate(user)==true)
		{
			obj.addObject("echo", "User is added successfully");			
		}
		else
	{
			obj.addObject("msg","Sorry! User is not added");
		}
	    obj.setViewName("redirect:/User");
	    return obj;
	}

}


