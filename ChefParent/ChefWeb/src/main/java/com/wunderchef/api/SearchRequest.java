package com.wunderchef.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wunderchef.bean.SearchList;
import com.wunderchef.service.SearchListServiceImpl;

@Controller
public class SearchRequest {
	
	
@RequestMapping(value = "/searchList.chf", params = { "searchParam" },method=RequestMethod.GET)//,headers = {"Accept=text/plain, application/json"}
public @ResponseBody List<SearchList> SearchChefOrCuisineList(@RequestParam("searchParam") String searchParam){
	
	List<SearchList> searchData =null;
	SearchListServiceImpl searchListServiceImpl = new SearchListServiceImpl();
	searchData = searchListServiceImpl.getSearchData();
	return searchData;
}

@RequestMapping(value = "/ChefInfoForm.chf",method=RequestMethod.GET)//,headers = {"Accept=text/plain, application/json"}
public @ResponseBody String loadChefInfoForm(){
	
	String data= "[{ \"header\": \"Chef Ram Singh\",\"data\": \"Some gems have hidden qualities beyond their luster, beyond their shine... Azurite is one of those gems.\",\"image\": \"images/4.jpg\"},{ \"header\": \"Chef Hrithik\", \"data\": \"Some gems have hidden qualities beyond their luster, beyond their shine... Azurite is one of those gems.\",\"image\": \"images/1.jpg\"},{\"header\": \"Chef Salman\",\"data\": \"Some gems have hidden qualities beyond their luster, beyond their shine... Azurite is one of those gems.\",\"image\": \"images/3.jpg\"}]";
	return data;
}
}
