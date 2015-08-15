package com.wunderchef.bean;

import java.io.Serializable;

public class ChefList implements Serializable{
	
	private static final long serialVersionUID = -7788619177798333712L;
	
	private String name;
	private String code;
	private String speciality;
	private String id;
	private String description;
	private String imagepath;
	
	
	public ChefList(String name, String code, String speciality, String id,String imagepath,
			String description) {
		//super();
		this.name = name;
		this.code = code;
		this.speciality = speciality;
		this.id = id;
		this.imagepath=imagepath;
		this.description = description;
	}
	
	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
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
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
