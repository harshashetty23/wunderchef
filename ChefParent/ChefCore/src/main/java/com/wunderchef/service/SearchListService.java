package com.wunderchef.service;

import java.util.List;

import com.wunderchef.bean.SearchList;

public interface SearchListService {

	public List<SearchList> getSearchData(String chart, int length);
}
