package com.niit.FashionShoppingBackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.FashionShoppingBackend.Dao.SupplierDao;
import com.niit.FashionShoppingBackend.model.Product;
import com.niit.FashionShoppingBackend.model.Supplier;

public class SupplierDaoImpl  implements SupplierDao{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public SupplierDaoImpl(SessionFactory sessionfactory ){
		this.sessionFactory=sessionFactory;
	}
	public boolean saveorupdate(Supplier supplier) {
	 sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		return true;
	}

	public boolean delete(Supplier supplier) {
		sessionFactory.getCurrentSession().delete(supplier);
		return true;
	}

	public Supplier getsupplier(String supplierId) {
		String s="From Supplier where supplierId='+supplierId+'";
		Query q=sessionFactory.getCurrentSession().createQuery(s);
		List<Supplier>lsupplier=(List<Supplier>)q.list();
		if(lsupplier==null||lsupplier.isEmpty())
		{
			System.out.println("Supplier not found");
			
			return null;
			}
			else
			{
				System.out.println("Supplier List");
				return lsupplier.get(0);
			}
		}


	public List<Supplier> list() {
		List<Supplier> Suppliers=(List<Supplier>)sessionFactory.getCurrentSession().createCriteria(Supplier.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return Suppliers;
	}
	
	
	}
	

