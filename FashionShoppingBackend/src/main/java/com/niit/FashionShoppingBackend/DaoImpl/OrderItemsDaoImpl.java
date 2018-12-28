package com.niit.FashionShoppingBackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.FashionShoppingBackend.Dao.OrderItemsDao;
import com.niit.FashionShoppingBackend.model.Order;
import com.niit.FashionShoppingBackend.model.OrderItems;

@Transactional
@Repository("orderItemsDao")

public class OrderItemsDaoImpl implements OrderItemsDao{
	
	@Autowired
    SessionFactory sessionFactory;
    
    public OrderItemsDaoImpl(SessionFactory sessionFactory)
    {
    	this.sessionFactory=sessionFactory;
    }


	public boolean saveorupdate(OrderItems orderItems) {
		sessionFactory.getCurrentSession().saveOrUpdate(orderItems);
		return true;
	}
	public boolean delete(OrderItems orderItems) {
		sessionFactory.getCurrentSession().delete(orderItems);
		return true;
	}

	public OrderItems getOrderItems(String ordId) {
		String s="From OrderItems where orderItemId='"+ordId+"'";
		Query q =sessionFactory.getCurrentSession().createQuery(s);
		List<OrderItems> lOrderItems=(List<OrderItems>)q.list();
		if(lOrderItems==null||lOrderItems.isEmpty())
		{
			System.out.println("OrderItems not found");
		return null;
		}
		else
		{
		System.out.println("OrderItems list");	
		 return lOrderItems.get(0);}
		}
	public List<OrderItems> ordlist() {
		List<OrderItems> OrderItems=(List<OrderItems>)sessionFactory.getCurrentSession().createCriteria(OrderItems.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return OrderItems;
			}


	
	}

