package com.wunderchef.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wunderchef.bean.ChefList;
import com.wunderchef.bean.SearchList;
import com.wunderchef.cache.CacheAdmin;
import com.wunderchef.cache.CacheService;
import com.wunderchef.service.SearchListServiceImpl;






@Controller
public class SearchRequest {
	
	@Autowired
	private CacheService cacheService;
	
	
@RequestMapping(value = "/searchList.chf", params = { "searchParam" },headers="Accept=*/*",method=RequestMethod.GET,produces = "application/json")//,headers = {"Accept=text/plain, application/json"}
public @ResponseBody List<SearchList> SearchChefOrCuisineList(@RequestParam("searchParam") String searchParam){
	
	List<SearchList> searchData =null;
	
	searchData = cacheService.getSearchData(searchParam);
	return searchData;
}

@RequestMapping(value = "/ChefInfoForm.chf",method=RequestMethod.GET)//,headers = {"Accept=text/plain, application/json"}
public @ResponseBody List<ChefList> loadChefInfoForm(){
	
	ArrayList<ChefList> searchData = new ArrayList<ChefList>();
	
	ChefList data = new ChefList("Chef Midas","chfmidas","North Indian Food","12345","images/new/img1.jpg","Chef Midas is fulfilling the classic indian dream. He started with a small indian restaurant modestly situated a few steps down from here. Soon chef midas was driven to expand");
	searchData.add(data);
	
	ChefList data1 = new ChefList("Chef Max","chfmax","North Indian /South Indian Food","12346","images/new/img2.jpg","Chef Max is fulfilling the classic indian dream. He started with a small indian restaurant modestly situated a few steps down from here. Soon chef midas was driven to expand");
	searchData.add(data1);
	
	ChefList data2 = new ChefList("Chef Raman","chfram","Chinese Food","12346","images/new/img3.jpg","Chef Raman is fulfilling the classic indian dream. He started with a small indian restaurant modestly situated a few steps down from here. Soon chef midas was driven to expand");
	searchData.add(data2);
	
	
	return searchData;
}
}
