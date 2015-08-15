package com.wunderchef.api;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.wunderchef.bean.MenuList;

import com.wunderchef.service.MenuListServiceImpl;

@Controller
public class MenuDataFetchController {
	
	@RequestMapping(value = "/MenuSearchList.chf", params = { "searchParam" },method=RequestMethod.GET)//,headers = {"Accept=text/plain, application/json"}
	public @ResponseBody List<MenuList> SearchMenuData(@RequestParam("searchParam") String searchParam){
		
		List<MenuList> menuData =null;
		MenuListServiceImpl menuListServiceImpl = new MenuListServiceImpl();
		menuData = menuListServiceImpl.getSearchData();
		return menuData;
	}

}
