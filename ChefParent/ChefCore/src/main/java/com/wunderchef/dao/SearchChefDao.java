package com.wunderchef.dao;

import java.util.List;

import com.wunderchef.entity.ChefMasterEntity;
import com.wunderchef.entity.CuisineMasterEntity;
import com.wunderchef.entity.DishMasterEntity;

public interface SearchChefDao {
	
	
	public List<ChefMasterEntity> getChefSearchData(String Char, int length);
	public List<DishMasterEntity> getDishSearchData(String chart, int length);
	public List<CuisineMasterEntity> getCuisineSearchData(String chart, int length);
}
