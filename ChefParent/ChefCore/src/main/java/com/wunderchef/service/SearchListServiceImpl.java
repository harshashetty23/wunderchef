package com.wunderchef.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wunderchef.bean.SearchList;
import com.wunderchef.dao.SearchChefDao;
import com.wunderchef.entity.ChefMasterEntity;
import com.wunderchef.entity.CuisineMasterEntity;
import com.wunderchef.entity.DishMasterEntity;

public class SearchListServiceImpl implements SearchListService{

	@Autowired
	private SearchChefDao searchChefDao;
	
	public List<SearchList> getSearchata(){
		
		ArrayList<SearchList> searchData = new ArrayList<SearchList>();
		
		SearchList data = new SearchList("Chicken Biryani","12344","CUISINE");
		searchData.add(data);
		
		SearchList data1 = new SearchList("Chicken Kadai","1234764","CUISINE");
		searchData.add(data1);
		
		SearchList data2 = new SearchList("Chicken pongal","564645","CUISINE");
		searchData.add(data2);
		
		SearchList data3 = new SearchList("Chilli Chicken","877887","CUISINE");
		searchData.add(data3);
		
		SearchList data4 = new SearchList("Chand nawab","987654","CHEF");
		searchData.add(data4);
		
		SearchList data5 = new SearchList("Chandu","6567898","CHEF");
		searchData.add(data5);
		return searchData;
	}
	public List<SearchList> getSearchData(String chart, int length){
		
		
		List<SearchList> searchData = new ArrayList<SearchList>();
		SearchList searchList = null;
		int i=0;
		List<ChefMasterEntity>  chefSearchData = searchChefDao.getChefSearchData(chart, length);
		List<DishMasterEntity>  dishSearchData = searchChefDao.getDishSearchData(chart, length);
		List<CuisineMasterEntity>  cuisineSearchData = searchChefDao.getCuisineSearchData(chart, length);
		if(chefSearchData != null && !chefSearchData.isEmpty())
		{
			for(i=0;i <chefSearchData.size();i++)
			{
				searchList =new SearchList();
				searchList.setCode(chefSearchData.get(i).getIdChef_master().toString());
				searchList.setName(chefSearchData.get(i).getChef_name());
				searchList.setType("CHEF");
				searchData.add(searchList);
			}
		}
		if(dishSearchData != null && !dishSearchData.isEmpty())
		{
			for(i=0;i <dishSearchData.size();i++)
			{
				searchList =new SearchList();
				searchList.setCode(dishSearchData.get(i).getIdDishMaster().toString());
				searchList.setName(dishSearchData.get(i).getDishName());
				searchList.setType("DISH");
				searchData.add(searchList);
			}
		}
		if(cuisineSearchData != null && !cuisineSearchData.isEmpty())
		{
			for(i=0;i <cuisineSearchData.size();i++)
			{
				searchList =new SearchList();
				searchList.setCode(cuisineSearchData.get(i).getIdCuisine_master().toString());
				searchList.setName(cuisineSearchData.get(i).getCusine_name());
				searchList.setType("CUISINE");
				searchData.add(searchList);
			}
		}
		return searchData;
	}
}
