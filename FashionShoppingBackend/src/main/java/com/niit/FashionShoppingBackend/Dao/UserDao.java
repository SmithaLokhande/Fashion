package com.niit.FashionShoppingBackend.Dao;

import java.util.List;
import com.niit.FashionShoppingBackend.model.User;

public interface UserDao 
{
	public boolean saveorupdate(User user);
	public boolean delete(User user);
	
	public List<User> list(); 
	
	public User getUser(String userId);
	public User getUseremail(String currusername);

	public User isvalid(String umail, String upwd);
	

}

