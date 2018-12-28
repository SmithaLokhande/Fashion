package com.niit.FashionShoppingBackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.FashionShoppingBackend.Dao.CartDao;
import com.niit.FashionShoppingBackend.model.Cart;

public class CartDaoImpl implements CartDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public CartDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}

	public boolean saveorupdate(Cart Cart) {
		sessionFactory.getCurrentSession().saveOrUpdate(Cart);
		return true;
	}

	public boolean delete(Cart Cart) {
		sessionFactory.getCurrentSession().delete(Cart);
		return true;
	}

	public Cart getCart(String carId) {
		String s="From Cart where CartId='+CartId+'";
		Query q=sessionFactory.getCurrentSession().createQuery(s);
		List<Cart>lCart=(List<Cart>)q.list();
		if(lCart==null||lCart.isEmpty())
		{
			System.out.println("Cart not found");
			
			return null;
			
			}
			else
			{
				System.out.println("Cart List");
				return lCart.get(0);
			}
		}

	public List<Cart> carlist() {
		List<Cart> cart =(List<Cart>) sessionFactory.getCurrentSession().createCriteria(Cart.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return cart;
	}

	

}
