package com.niit.FashionShoppingBackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.FashionShoppingBackend.Dao.AuthenticationDao;
import com.niit.FashionShoppingBackend.model.Authentication;

@Transactional
@Repository("authenticationDao")

public class AuthenticationDaoImpl implements AuthenticationDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public AuthenticationDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}
	
	public boolean saveorupdate(Authentication authentication) {
		sessionFactory.getCurrentSession().saveOrUpdate(authentication);
		return true;
	}

	public boolean delete(Authentication authentication) {
		sessionFactory.getCurrentSession().delete(authentication);
		return true;
		
	}

	public Authentication get(String authenticationId) {
		String s="From Authentication where authenticationId='"+authenticationId+"'";
		Query q=sessionFactory.getCurrentSession().createQuery(s);
		List<Authentication>lauthentication=(List<Authentication>)q.list();
		if(lauthentication==null||lauthentication.isEmpty())
		{
			System.out.println("Authentication not found");
			
			return null;
			
			}
			else
			{
				System.out.println("Authentication List");
				return lauthentication.get(0);
			}
		}

	public List<Authentication> list() {
		List<Authentication> authentication =(List<Authentication>) sessionFactory.getCurrentSession().createCriteria(Authentication.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return authentication;
	}

	

	
	}

