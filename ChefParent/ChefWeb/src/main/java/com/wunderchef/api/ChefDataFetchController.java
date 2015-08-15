package com.wunderchef.api;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wunderchef.bean.ChefList;
import com.wunderchef.service.ChefListServiceImpl;

@Controller
public class ChefDataFetchController {

	@RequestMapping(value = "/ChefSearchList.chf", params = { "searchParam" },method=RequestMethod.GET)//,headers = {"Accept=text/plain, application/json"}
	public @ResponseBody List<ChefList> SearchChefOrCuisineList(@RequestParam("searchParam") String searchParam){
		
		List<ChefList> chefData =null;
		ChefListServiceImpl chefListServiceImpl = new ChefListServiceImpl();
		chefData = chefListServiceImpl.getSearchData();
		return chefData;
	}
}
