package com.niit.FashionShoppingBackend.Config;

import java.util.Properties;
import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.FashionShoppingBackend.Dao.CategoryDao;
import com.niit.FashionShoppingBackend.Dao.ProductDao;
import com.niit.FashionShoppingBackend.Dao.SupplierDao;
import com.niit.FashionShoppingBackend.Dao.UserDao;
import com.niit.FashionShoppingBackend.DaoImpl.CategoryDaoImpl;
import com.niit.FashionShoppingBackend.DaoImpl.ProductDaoImpl;
import com.niit.FashionShoppingBackend.DaoImpl.SupplierDaoImpl;
import com.niit.FashionShoppingBackend.DaoImpl.UserDaoImpl;
import com.niit.FashionShoppingBackend.model.Authentication;
import com.niit.FashionShoppingBackend.model.Billing;
import com.niit.FashionShoppingBackend.model.Cart;
import com.niit.FashionShoppingBackend.model.CartItems;
import com.niit.FashionShoppingBackend.model.Category;
import com.niit.FashionShoppingBackend.model.Order;
import com.niit.FashionShoppingBackend.model.OrderItems;
import com.niit.FashionShoppingBackend.model.Payment;
import com.niit.FashionShoppingBackend.model.Product;
import com.niit.FashionShoppingBackend.model.Shipping;
import com.niit.FashionShoppingBackend.model.Supplier;
import com.niit.FashionShoppingBackend.model.User;

@Configuration
@ComponentScan("com.niit.*")
@EnableTransactionManagement
public class ApplicationContext
{
	@Bean("dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test/fashion");
		dataSource.setUsername("sl");
		dataSource.setPassword("sl");
		return dataSource;
	}
   private Properties getHibernateProperties() {
	Properties properties = new Properties();
	properties.put("hibernate.connection.pool_size", "10");
	properties.put("hibernate.hbm2ddl.auto","update");
	properties.put("hibernate.show_sql","true");
	properties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
	return properties;
   }
   @Autowired
   @Bean("sessionFactory")
   public SessionFactory getSessionFactory(DataSource dataSource) {
	   LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	   sessionBuilder.addProperties(getHibernateProperties());
	   sessionBuilder.addAnnotatedClass(Category.class);
	   sessionBuilder.addAnnotatedClass(Product.class);
	   sessionBuilder.addAnnotatedClass(Supplier.class);
	   sessionBuilder.addAnnotatedClass(User.class);
	   sessionBuilder.addAnnotatedClass(Billing.class);
	   sessionBuilder.addAnnotatedClass(Authentication.class);
	   sessionBuilder.addAnnotatedClass(Cart.class);
	   sessionBuilder.addAnnotatedClass(CartItems.class);
	   sessionBuilder.addAnnotatedClass(Order.class);
	   sessionBuilder.addAnnotatedClass(OrderItems.class);
	   sessionBuilder.addAnnotatedClass(Payment.class);
	   sessionBuilder.addAnnotatedClass(Shipping.class);
	      
	   return sessionBuilder.buildSessionFactory();
   }
   @Autowired
   @Bean("transactionManager")
   public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
	   HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
	   return transactionManager;
   }
   
   @Autowired
   @Bean("categoryDao")
   public CategoryDao getCategoryDao(SessionFactory sessionFactory) {
	   return  new CategoryDaoImpl(sessionFactory);
   }
   
   @Autowired
   @Bean("produtDao")
   public ProductDao getPoductDao(SessionFactory sessionFactory) {
	   return  new ProductDaoImpl(sessionFactory);
   }
   
   @Autowired
   @Bean("supplierDao")
   public SupplierDao getSupplierDao(SessionFactory sessionFactory) {
   return new SupplierDaoImpl(sessionFactory);
   }
   
   @Autowired
   @Bean("userDao")
   public UserDao getorderDao(SessionFactory sessionFactory) {
	   return new UserDaoImpl(sessionFactory);
	
}
}
