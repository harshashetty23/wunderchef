package com.wunderchef.bean;

import java.io.Serializable;

public class MenuList implements Serializable{
	
	private static final long serialVersionUID = -7788619177798333712L;
	private String category;
	private String name;
	private String price;
	private Boolean type;
	private String menu_item_description;
	private String menu_item_small_description;
	private String code;
	
	
		
	
	
	public MenuList(String category, String name, String price, Boolean type,
			String menu_item_description, String menu_item_small_description,
			String code) {
		super();
		this.category = category;
		this.name = name;
		this.price = price;
		this.type = type;
		this.menu_item_description = menu_item_description;
		this.menu_item_small_description = menu_item_small_description;
		this.code = code;
	}
	public Boolean getType() {
		return type;
	}
	public void setType(Boolean type) {
		this.type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getMenu_item_description() {
		return menu_item_description;
	}
	public void setMenu_item_description(String menu_item_description) {
		this.menu_item_description = menu_item_description;
	}
	public String getMenu_item_small_description() {
		return menu_item_small_description;
	}
	public void setMenu_item_small_description(String menu_item_small_description) {
		this.menu_item_small_description = menu_item_small_description;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
