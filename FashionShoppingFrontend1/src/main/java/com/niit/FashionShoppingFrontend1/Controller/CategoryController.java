package com.niit.FashionShoppingFrontend1.Controller;
	
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.FashionShoppingBackend.Dao.CategoryDao;
import com.niit.FashionShoppingBackend.Dao.ProductDao;
import com.niit.FashionShoppingBackend.Dao.SupplierDao;
import com.niit.FashionShoppingBackend.model.Category;
import com.niit.FashionShoppingBackend.model.Product;

@Controller
public class CategoryController {
	@Autowired
    Category category;
	@Autowired
	CategoryDao categoryDao;	
	@Autowired
	Product product;
		@Autowired
		ProductDao productDao;	
	@RequestMapping("/Category")
	public ModelAndView categoryform()
	{
		List<Category> categories=categoryDao.catlist();
		ModelAndView obj=new ModelAndView("Category");
		obj.addObject("category", new Category());
		obj.addObject("categories", categories);
		return obj;
	}
		
	@RequestMapping(value="/addcat", method=RequestMethod.POST)
	public ModelAndView addcategory(@ModelAttribute("category") Category category)
		{
			ModelAndView obj=new ModelAndView("redirect:/Category");
		    categoryDao.saveorupdate(category);
			obj.addObject("echo","Category is added successfully");
			if(categoryDao.saveorupdate(category)==true)
			{
				obj.addObject("echo","Category is added successfully");
		}
		else
		{
			obj.addObject("msg","sorry!");
			
		}
			return obj;
			}
	
		
	@RequestMapping("/edicat/{catId}")
		public ModelAndView editcategory(@PathVariable("catId")String catId)
	{
		System.out.println(123);
			List<Product> products=productDao.list();
			List<Category> categories=categoryDao.catlist();
//			List<Supplier> supplies=SupplierDao.Supplist();
			ModelAndView obj=new ModelAndView("Category");
		category=categoryDao.getCategory(catId);
			obj.addObject("category", category);
//			product=ProductDao.getproduct(productId);
//			obj.addObject("product",product);
//			obj.addObject("products", products);
		obj.addObject("categories", categories);
//			obj.addObject("supplies", supplies);
			return obj;
			}
		
		
	@RequestMapping("/deletecategory/{catId}")
		public ModelAndView deleteCategory(@PathVariable("catId")String catId, Product Productlist)
		{
			ModelAndView obj=new ModelAndView("redirect:/Category");
			category=categoryDao.getCategory(catId);
			// subCategory=subCategoryDao.getSubCatId(subCatId);
			//Category sublist=categoryDao.getCategory(catId);
//		List<Product>lists=productDao.getProductBySubCategory(Subcategory);
//			Productlist=productDao.getproduct(catId);

//			if(lists==null)
//			{
//				categoryDao.delete(category);
//				obj.addObject("msg","Category is deleted successfully");
//			}
//		else
//			{
//				for(Product productlist:lists)
//				{
//					productDao.delete(productlist);
//				}
		List<Category>categories=categoryDao.catlist();
				categoryDao.delete(category);
		obj.addObject("categories", categories);
			
//			}
			categoryDao.delete(category);
obj.addObject("msg","Category andSubCategory is deleted successfully");
obj.addObject("msg","Category not deleted");
		
			return obj;	}
//		}
	}



