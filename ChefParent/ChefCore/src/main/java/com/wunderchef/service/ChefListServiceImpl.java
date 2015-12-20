package com.wunderchef.service;

import java.util.ArrayList;
import java.util.List;

import com.wunderchef.bean.ChefList;

public class ChefListServiceImpl {
	
public List<ChefList> getSearchData(){
		
		ArrayList<ChefList> searchData = new ArrayList<ChefList>();
		
		ChefList data = new ChefList("Chef Midas","chfmidas","North Indian Food","12345","images/new/img1.jpg","Chef Midas is fulfilling the classic indian dream. He started with a small indian restaurant modestly situated a few steps down from here. Soon chef midas was driven to expand");
		searchData.add(data);
		
		ChefList data1 = new ChefList("Chef Max","chfmax","North Indian /South Indian Food","12346","images/new/img2.jpg","Chef Max is fulfilling the classic indian dream. He started with a small indian restaurant modestly situated a few steps down from here. Soon chef midas was driven to expand");
		searchData.add(data1);
		
		ChefList data2 = new ChefList("Chef Raman","chfram","Chinese Food","12346","images/new/img3.jpg","Chef Raman is fulfilling the classic indian dream. He started with a small indian restaurant modestly situated a few steps down from here. Soon chef midas was driven to expand");
		searchData.add(data2);
		
		ChefList data3 = new ChefList("Chef Laxman","chflax","Continental/Mexican Food","12346","images/new/img4.jpg","Chef Laxman is fulfilling the classic indian dream. He started with a small indian restaurant modestly situated a few steps down from here. Soon chef midas was driven to expand");
		searchData.add(data3);
		
		ChefList data4 = new ChefList("Chef Vijay","chfvij","South and thai Food","12346","images/new/img5.jpg","Chef Vijay is fulfilling the classic indian dream. He started with a small indian restaurant modestly situated a few steps down from here. Soon chef midas was driven to expand");
		searchData.add(data4);
		
		ChefList data5 = new ChefList("Chef loy","chfloy","Bengali Food","12346","images/new/img6.jpg","Chef loy is fulfilling the classic indian dream. He started with a small indian restaurant modestly situated a few steps down from here. Soon chef midas was driven to expand");
		searchData.add(data5);
		
		ChefList data6 = new ChefList("Chef Eshaan","chfesh","Bhojpuri Food","12346","images/new/img7.jpg","Chef Ehsaan is fulfilling the classic indian dream. He started with a small indian restaurant modestly situated a few steps down from here. Soon chef midas was driven to expand");
		searchData.add(data6);
		
		ChefList data7 = new ChefList("Chef Shankar","chfloy","Andhra Food","12346","images/new/img8.jpg","Chef Shankar is fulfilling the classic indian dream. He started with a small indian restaurant modestly situated a few steps down from here. Soon chef midas was driven to expand");
		searchData.add(data7);
	
		
		return searchData;
	}

}
