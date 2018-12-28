package com.niit.FashionShoppingFrontend1.Controller;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.http.HttpSession;

import org.omg.IOP.ServiceContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.FashionShoppingBackend.Dao.CartDao;
import com.niit.FashionShoppingBackend.Dao.CartItemsDao;
import com.niit.FashionShoppingBackend.Dao.ProductDao;
import com.niit.FashionShoppingBackend.Dao.UserDao;
import com.niit.FashionShoppingBackend.model.Authentication;
import com.niit.FashionShoppingBackend.model.Cart;
import com.niit.FashionShoppingBackend.model.CartItems;
import com.niit.FashionShoppingBackend.model.Product;
import com.niit.FashionShoppingBackend.model.User;
import com.niit.FashionshoppingBackend.UserTest;

public class CartController {
		Product product;
		@Autowired 
		ProductDao productDao;
		
		@Autowired 
		UserTest user;
		@Autowired 
		UserDao userDao;
		
		@Autowired
		Cart cart;
		@Autowired
		CartDao cartDao;
		
		@Autowired
		CartItems cartItems;
		@Autowired
		CartItemsDao cartItemsDao;
		
		@Autowired
		HttpSession session;
		
		@RequestMapping("/addtocart/{id}")
		public ModelAndView cart(@PathVariable("id") String id) 
		{
			Authentication authentication = ServiceContextHolder.getContext().getAuthentication();
			if (!(authentication instanceof AnonymousAuthenticationToken)) {
				String currusername = authentication.getUserName();
		User u = userDao.getUser(currusername);
		if (user == null)
		{
			return new ModelAndView("redirect:/");
		} 
		else
		{
			cart = u.getCart();
			Product product1 = productDao.get(id);
			com.niit.FashionShoppingBackend.model.CartItems cartItem = new CartItems();
			cartItem.setCartItemId(cart);
			cartItem.setPrice(product1);
			cartItem.setPrice(product1.getPrice());
			cartItemsDao.saveorupdate(cartItem);
			cart.setGrandtotal(cart.getGrandtotal() + product1.getPrice());
			cart.setTotalItems(cart.getTotalItems() + 1);
			cartDao.saveorupdateCart(cart);
			session.setAttribute("items", cart.getTotalItems());
			session.setAttribute("gd", cart.getGrandTotal());
			return new ModelAndView("redirect:/");
			}
			}
			else {
				return new ModelAndView("redirect:/");
			}
		}
		
		@RequestMapping(value = "/viewcart")
		public String viewcart(Model model, HttpSession session) 
		{
			System.out.println(1223);
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			if (!(authentication instanceof AnonymousAuthenticationToken))
			{
				String currusername = authentication.getUserName();
				User u = userDao.getUser(currusername);
			        Cart c=u.getCart();
					List<CartItems> cartItem = cartItemsDao.getlist();
					if(cartItem==null ||cartItem.isEmpty())
					{
						session.setAttribute("items",0);
						model.addAttribute("gtotal",0.0);
						model.addAttribute("msg", "no Items is added to cart");
						return "viewcart";		
					}
					
					model.addAttribute("cartItems", cartItem);
					model.addAttribute("gtotal",c.getGrandTotal());
					session.setAttribute("items",c.getTotalItems());
				    session.setAttribute("cartId", c.getCartId());
					return "viewcart";		
		}
			else
			{
				return "redirect:/viewcart";
			}
		}
		
		@RequestMapping(value="/Remove/{carId}")
		public ModelAndView RemoveFromCart(@PathVariable("carId") String id)
		{
			ModelAndView obj= new ModelAndView("redirect:/viewcart");
			cartItems=cartItemsDao.get(id);
			Cart c=cartItems.getCart();
			c.setGrandTotal(c.getGrandTotal()-cartItems.getPrice());
			c.setTotalItems(c.getTotalItems()-1);
			cartDao.saveorupdateCart(c);
			
			cartItemsDao.deleteCartItems(cartItems);
			return obj;
		}
		
		@RequestMapping(value="/Removeall")
		public String RemoveallFromCart(Model model,HttpSession session)
		{
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			if (!(authentication instanceof AnonymousAuthenticationToken))
			{
				String currusername = authentication.getUserName();
				User u = userDao.getUser(currusername);
			Cart c=cartDao.getcart(u.getCart().getCartId());
			List<CartItems> cartItems=cartItemsDao.getCartItemslist(u.getCart().getCartId());
			for(CartItems g:cartItems)
			{
				cartItemsDao.deleteCartItems(g);
			}
			c.setGrandTotal(0.0);;
			c.setTotalItems(0);
			cartDao.saveorupdateCart(c);
			session.setAttribute("items",c.getTotalItems());
			return "redirect:/viewcart";
		}
			else
			{
				return "redirect:/";
			}
		}
		
		@RequestMapping("/addtocartR/{p_id}")
		public ModelAndView cart(@PathVariable("p_id") String id) {
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			if (!(authentication instanceof AnonymousAuthenticationToken)) {
				String currusername = authentication.getUserName();
				User u = userDao.getUser(currusername);
				if (user == null) {
					return new ModelAndView("redirect:/");
			}
 else 
{
					cart = u.getCart();
					product = productDao.getProduct(id);
					CartItems cartItem = new CartItems();
					cartItem.setCartItemId(cart);
					cartItem.setPrice(product);
					cartItem.setPrice(product.getP_c());
					cartItemDao.saveOrUpdate(cartItem);
					cart.setGrandtotal(cart.getGrandtotal() + product.getP_c());
					cart.setTotalitems(cart.getTotalitems() + 1);
					cartDao.saveOrUpdate(cart);
					session.setAttribute("items", cart.getTotalitems());
					session.setAttribute("gd", cart.getGrandtotal());
					return new ModelAndView("redirect:/viewcart");
				}
			} else {
				return new ModelAndView("redirect:/");
			}
	
		}
		@RequestMapping("/addtocartC/{p_id}")
		public ModelAndView cartc(@PathVariable("p_id") String id) {
	
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			if (!(authentication instanceof AnonymousAuthenticationToken)) {
				String currusername = authentication.getUserName();
				User u = userDao.getUser(currusername);
				if (user == null) {
					return new ModelAndView("redirect:/");
				} else {
	
					cart = u.getCart();
					product = productDao.getProduct(id);
					CartItems cartItem = new CartItems();
					cartItem.setCartItemId(cart);
					cartItem.setPrice(product);
					cartItem.setPrice(product.getP_c());
					cartItemDao.saveOrUpdate(cartItem);
					cart.setGrandtotal(cart.getGrandtotal() + product.getP_c());
					cart.setTotalitems(cart.getTotalitems() + 1);
					cartDao.saveOrUpdate(cart);
					session.setAttribute("items", cart.getTotalitems());
					session.setAttribute("gd", cart.getGrandtotal());
					return new ModelAndView("redirect:/viewcart");
				}
			} else {
				return new ModelAndView("redirect:/");
			}		}


	}




