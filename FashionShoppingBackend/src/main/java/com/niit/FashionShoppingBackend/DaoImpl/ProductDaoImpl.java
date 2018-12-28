package com.niit.FashionShoppingBackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.FashionShoppingBackend.Dao.ProductDao;
import com.niit.FashionShoppingBackend.model.Product;

@Transactional
@Repository("productDao")
public class ProductDaoImpl implements ProductDao {
      @Autowired
      SessionFactory sessionFactory;
      
      public ProductDaoImpl(SessionFactory sessionFactory ) {
    	  this.sessionFactory=sessionFactory;
      }

	public boolean saveorupdate(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		return true;
	}

	public boolean delete(Product product) {
		sessionFactory.getCurrentSession().delete(product);
		return true;
	}

	public Product getproduct(String productId) {
		String s="From Product where productId='+productId+'";
		Query q=sessionFactory.getCurrentSession().createQuery(s);
		List<Product>lproduct=(List<Product>)q.list();
		if(lproduct==null||lproduct.isEmpty())
		{
			System.out.println("Product not found");
		
		return null;
		}
		else
		{
			System.out.println("Product List");
			return lproduct.get(0);
		}
	}
	public List<Product> list() {
		List<Product> Products=(List<Product>)sessionFactory.getCurrentSession().createCriteria(Product.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return Products;
	}

	

}
