package com.niit.FashionShoppingBackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.FashionShoppingBackend.Dao.ShippingDao;
import com.niit.FashionShoppingBackend.model.Billing;
import com.niit.FashionShoppingBackend.model.Category;
import com.niit.FashionShoppingBackend.model.Shipping;
@Transactional
@Repository("shippingDao")
public class ShippingDaoImpl implements ShippingDao {
	
	@Autowired
	SessionFactory sessionFactory;
	public ShippingDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}

	public boolean saveorupdate(Shipping shipping) {
		sessionFactory.getCurrentSession().saveOrUpdate(shipping);
		return true;
	}

	public boolean delete(Shipping shipping) {
		sessionFactory.getCurrentSession().delete(shipping);
		return true;
	}

	public Shipping getshipping(String shippingId) {
		String s="From Shipping where shippingId='+shippingId+'";
		Query q=sessionFactory.getCurrentSession().createQuery(s);
		List<Shipping>lshipping=(List<Shipping>)q.list();
		if(lshipping==null||lshipping.isEmpty())
		{
			System.out.println("Shipping not found");
			
			return null;
			
			}
			else
			{
				System.out.println("Shipping List");
				return lshipping.get(0);
			}
		}
	

	public List<Shipping> list() {
		List<Shipping>shipping = (List<Shipping>)
				sessionFactory.getCurrentSession().createCriteria(Shipping.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return shipping;
	}

	public List<Shipping> getaddbyuser(String userId) {
		String s="From Shipping where userId='+userId+'";
		Query q=sessionFactory.getCurrentSession().createQuery(s);
		List<Shipping>lshipping=(List<Shipping>)q.list();
		if(lshipping==null||lshipping.isEmpty())
		{
			System.out.println("Shipping not found");
			
			return null;
			
			}
			else
			{
				System.out.println("Shipping List");
				return lshipping;
			}
	}

	
}
