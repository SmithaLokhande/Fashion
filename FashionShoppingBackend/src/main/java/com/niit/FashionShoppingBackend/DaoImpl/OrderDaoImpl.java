package com.niit.FashionShoppingBackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.FashionShoppingBackend.Dao.OrderDao;
import com.niit.FashionShoppingBackend.model.Order;

@Transactional
@Repository("orderDao")

public class OrderDaoImpl implements OrderDao {
        @Autowired
	    SessionFactory sessionFactory;
	    
	    public OrderDaoImpl(SessionFactory sessionFactory)
	    {
	    	this.sessionFactory=sessionFactory;
	    }

	public boolean saveorupdate(Order order) {
		sessionFactory.getCurrentSession().saveOrUpdate(order);
		return true;
	}

	public boolean delete(Order order) {
		sessionFactory.getCurrentSession().delete(order);
		return true;
	}
	public Order getOrder(String OrderId) {
		String s="From Order where OrderId='"+OrderId+"'";
		Query q =sessionFactory.getCurrentSession().createQuery(s);
		List<Order>lOrder=(List<Order>)q.list();
		if(lOrder==null||lOrder.isEmpty())
		{
			System.out.println("Order not found");
		
		return null;
		}
		else
		{
		System.out.println("Order list");	
		 return lOrder.get(0);
		}
	}
	public List<Order> list()
	{
List<Order> Order=(List<Order>)sessionFactory.getCurrentSession().createCriteria(Order.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
return Order;
	}

	

	
}
