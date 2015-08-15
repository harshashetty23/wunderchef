package com.wunderchef.service;

import java.util.ArrayList;
import java.util.List;

import com.wunderchef.bean.MenuList;


public class MenuListServiceImpl {
public List<MenuList> getSearchData(){
		
		ArrayList<MenuList> searchData = new ArrayList<MenuList>();
		
		MenuList data = new MenuList("Soup","Adraki Dhal Shorba","100",false,"items served when is hot","A super low calorie salad ( 75 kcal per portion) and its a good source of sodium, calcium and iron. A combination of iceberg lettuce, tossed with classic Caesar dressing, grilled zucchini, olives and oven fresh croutons. ","mnx12345");
		searchData.add(data);
		
		MenuList data1 = new MenuList("Soup","Badam  Shorba","75",true,"items served when is hot","A super low calorie salad ( 75 kcal per portion) and its a good source of sodium, calcium and iron. A combination of iceberg lettuce, tossed with classic Caesar dressing, grilled zucchini, olives and oven fresh croutons. ","mnx12345");
		searchData.add(data1);
		
		MenuList data2 = new MenuList("Soup","Palak Shorba","80",true,"items served when is hot","A super low calorie salad ( 75 kcal per portion) and its a good source of sodium, calcium and iron. A combination of iceberg lettuce, tossed with classic Caesar dressing, grilled zucchini, olives and oven fresh croutons. ","mnx12345");
		searchData.add(data2);
		
		MenuList data3 = new MenuList("Soup","Cashew Nut Fry","85",false,"items served when is hot","A super low calorie salad ( 75 kcal per portion) and its a good source of sodium, calcium and iron. A combination of iceberg lettuce, tossed with classic Caesar dressing, grilled zucchini, olives and oven fresh croutons. ","mnx12345");
		searchData.add(data3);
		
		MenuList data4 = new MenuList("Snacks","Cheese Cherry Pineapple","85",true,"items served when is hot","A super low calorie salad ( 75 kcal per portion) and its a good source of sodium, calcium and iron. A combination of iceberg lettuce, tossed with classic Caesar dressing, grilled zucchini, olives and oven fresh croutons. ","mnx12345");
		searchData.add(data4);
		
		MenuList data5 = new MenuList("Snacks","French Fries","185",true,"items served when is hot","A super low calorie salad ( 75 kcal per portion) and its a good source of sodium, calcium and iron. A combination of iceberg lettuce, tossed with classic Caesar dressing, grilled zucchini, olives and oven fresh croutons. ","mnx12345");
		searchData.add(data5);
		
		MenuList data6 = new MenuList("Snacks","Peanut Masala","95",false,"items served when is hot","A super low calorie salad ( 75 kcal per portion) and its a good source of sodium, calcium and iron. A combination of iceberg lettuce, tossed with classic Caesar dressing, grilled zucchini, olives and oven fresh croutons. ","mnx12345");
		searchData.add(data6);
		
		MenuList data7 = new MenuList("Starters","Peanut Masala","200",true,"","","");
		searchData.add(data7);
		
		MenuList data8 = new MenuList("Starters","mushroom Masala","220",true,"","","");
		searchData.add(data8);
		
		MenuList data9 = new MenuList("Meals","Veg Carrier Meals","125",true,"","","");
		searchData.add(data9);
		
		MenuList data10 = new MenuList("Meals","NonVeg Carrier Meals","260",false,"items served when is hot","A super low calorie salad ( 75 kcal per portion) and its a good source of sodium, calcium and iron. A combination of iceberg lettuce, tossed with classic Caesar dressing, grilled zucchini, olives and oven fresh croutons. ","mnx12345");
		searchData.add(data10);
		
		MenuList data11 = new MenuList("Rice","Curd Rice","85",true,"","","");
		searchData.add(data11);
		
		MenuList data12 = new MenuList("Rice","Jeera Rice","90",true,"","","");
		searchData.add(data12);
		
		MenuList data13 = new MenuList("Rice","Palak Rice","125",true,"items served when is hot","A super low calorie salad ( 75 kcal per portion) and its a good source of sodium, calcium and iron. A combination of iceberg lettuce, tossed with classic Caesar dressing, grilled zucchini, olives and oven fresh croutons. ","mnx12345");
		searchData.add(data13);
		
		MenuList data14 = new MenuList("Rice","Steamed Rice","260",false,"","","");
		searchData.add(data14);
		
		MenuList data15 = new MenuList("Rice","Veg Carrier Meals","125",true,"","","");
		searchData.add(data15);
		
		MenuList data16 = new MenuList("Rice","NonVeg Carrier Meals","260",false,"","","");
		searchData.add(data16);
		
		MenuList data17 = new MenuList("Rice","Veg Biryani","125",true,"","","");
		searchData.add(data17);
		
		MenuList data18 = new MenuList("Rice","Chicken Biryani","260",false,"","","");
		searchData.add(data18);
		
		return searchData;
	}

}
