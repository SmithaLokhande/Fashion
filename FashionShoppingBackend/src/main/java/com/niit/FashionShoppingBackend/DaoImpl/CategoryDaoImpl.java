package com.niit.FashionShoppingBackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.FashionShoppingBackend.Dao.CategoryDao;
import com.niit.FashionShoppingBackend.model.Category;

@SuppressWarnings("deprecation")
@Transactional
@Repository("categoryDao")

public  class CategoryDaoImpl implements CategoryDao
{
	@Autowired
	SessionFactory sessionFactory;
	
	public CategoryDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public boolean saveorupdate(Category category) {
		sessionFactory.getCurrentSession().saveOrUpdate(category);
		return true;
	}
	@Transactional
	public boolean delete(Category category) 
		{
	   sessionFactory.getCurrentSession().delete(category);
			return true;
		}
	@Transactional
	public Category getCategory(String catId) {
		String q1="from Category where catId='" + catId + "'";
		Query w=sessionFactory.getCurrentSession().createQuery(q1);
		List<Category>list=(List<Category>)w.list();
		if(list == null || list.isEmpty())
		{	
			return null;
		}
		return list.get(0);
	}
	@Transactional
	public List<Category>catlist() {
		List<Category>categorys = (List<Category>)
	sessionFactory.getCurrentSession().createCriteria(Category.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return categorys;
	}
	

	
	

	

	

}
