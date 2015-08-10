package com.wunderchef.service;

import java.util.ArrayList;
import java.util.List;

import com.wunderchef.bean.SearchList;

public class SearchListServiceImpl {

	public List<SearchList> getSearchData(){
		
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
}
