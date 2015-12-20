package com.wunderchef.bean;

import java.io.Serializable;

public class SearchList implements Serializable{
	
	private static final long serialVersionUID = -7788619177798333712L;
	private String name;
	private String code;
	private String type;
	public SearchList(String name,String code,String type)
	{
		this.name=name;
		this.code=code;
		this.type=type;
	}
	public SearchList() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
