package com.wunderchef.cache;

import java.util.List;

//import org.springframework.cache.annotation.CacheEvict;
//import org.springframework.cache.annotation.Cacheable;



import org.springframework.beans.factory.annotation.Autowired;

import com.wunderchef.bean.SearchList;
import com.wunderchef.service.SearchListService;
import com.wunderchef.cache.CacheAdmin;

public class CacheService{
	
	//@CacheEvict(value = "chefcache", key = "#searchParam")
	//@Cacheable(value = "chefcache", key = "#searchParam")
	
	@Autowired
	private CacheAdmin cacheAdmin;
	
	@Autowired
	SearchListService searchListServiceImpl;
	
	@SuppressWarnings("unchecked")
	public List<SearchList> getSearchData(String searchParam){
		
		List<SearchList> searchData =null;
		try {
			searchData = (List<SearchList>)cacheAdmin.getFromCache("Cache::"+searchParam);
		
		if(searchParam != null && searchData == null || searchData.isEmpty())
		{
		
		searchData = searchListServiceImpl.getSearchData(searchParam,searchParam.length());
		cacheAdmin.putInCache("Cache::"+searchParam, searchData);
		}
		} catch (CacheManagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return searchData;
	}
}
