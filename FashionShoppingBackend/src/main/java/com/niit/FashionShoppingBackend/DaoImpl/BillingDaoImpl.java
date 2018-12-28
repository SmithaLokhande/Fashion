package com.niit.FashionShoppingBackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.FashionShoppingBackend.Dao.BillingDao;
import com.niit.FashionShoppingBackend.model.Billing;
import com.niit.FashionShoppingBackend.model.User;

public class BillingDaoImpl implements BillingDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public BillingDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}
	
	public boolean saveorupdate(Billing billing) {
		sessionFactory.getCurrentSession().saveOrUpdate(billing);
		return true;
		
	}

	public boolean delete(Billing billing) {
		sessionFactory.getCurrentSession().delete(billing);
		return true;
	}

	public Billing getbilling(String UserId) {
		String s="From Billing where UserId='+UserId+'";
		Query q=sessionFactory.getCurrentSession().createQuery(s);
		List<Billing>lbilling=(List<Billing>)q.list();
		if(lbilling==null||lbilling.isEmpty())
		{
			System.out.println("Billing not found");
			
			return null;
			
			}
			else
			{
				System.out.println("Billing List");
				return lbilling.get(0);
			}
		}


	public List<Billing> list() {
		List<Billing> Billings=(List<Billing>)sessionFactory.getCurrentSession().createCriteria(Billing.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return Billings;
	}

}
