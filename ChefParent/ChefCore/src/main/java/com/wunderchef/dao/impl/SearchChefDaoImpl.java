package com.wunderchef.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wunderchef.dao.SearchChefDao;
import com.wunderchef.entity.ChefMasterEntity;
import com.wunderchef.entity.CuisineMasterEntity;
import com.wunderchef.entity.DishMasterEntity;

@Repository
@Transactional(value="TransactionManager")
public class SearchChefDaoImpl implements SearchChefDao{

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	public List<ChefMasterEntity> getChefSearchData(String chart, int length)
	{
		List<ChefMasterEntity> queryval=null;
		try{
			if (null != chart && 0 != length) {
				String chef_query="select {s.*} from chef_master s where (substring( s.custom_chef_name, 1, "+length+" ) IN ('"+chart+"'))";
				Query query = sessionFactory.getCurrentSession().createSQLQuery(chef_query).addEntity("s", ChefMasterEntity.class);
				
				queryval= (List<ChefMasterEntity>)query.list();
		
			}
	}
		catch(HibernateException e){
			e.printStackTrace();
			}
		return queryval;
	}
	public List<DishMasterEntity> getDishSearchData(String chart, int length)
	{
		List<DishMasterEntity> queryval=null;
		try{
			if (null != chart && 0 != length) {
				String dish_query="select {s.*} from dish_master s where (substring( s.dish_name, 1, "+length+" ) IN ('"+chart+"'))";
				Query query = sessionFactory.getCurrentSession().createSQLQuery(dish_query).addEntity("s", DishMasterEntity.class);
				
				queryval= (List<DishMasterEntity>)query.list();
		
			}
	}
		catch(HibernateException e){
			e.printStackTrace();
			}
		return queryval;
	}
	public List<CuisineMasterEntity> getCuisineSearchData(String chart, int length)
	{
		List<CuisineMasterEntity> queryval=null;
		try{
			if (null != chart && 0 != length) {
				String cuisine_query="select {s.*} from cuisine_master s where (substring( s.cuisine_name, 1, "+length+" ) IN ('"+chart+"'))";
				Query query = sessionFactory.getCurrentSession().createSQLQuery(cuisine_query).addEntity("s", CuisineMasterEntity.class);
				
				queryval= (List<CuisineMasterEntity>)query.list();
		
			}
	}
		catch(HibernateException e){
			e.printStackTrace();
			}
		return queryval;
	}
		
}
