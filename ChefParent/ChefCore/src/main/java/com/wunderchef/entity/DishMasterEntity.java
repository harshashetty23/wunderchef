package com.wunderchef.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dish_master")
public class DishMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idDISH_MASTER", nullable = false, unique = true)
	private Integer idDishMaster;
	
	@Basic
	@Column(name = "REL_CUISINE_ID", nullable = true, unique = false)
	private Integer relCuisineId;
	
	
	@Basic
	@Column(name = "REL_CHEF_ID", nullable = true, unique = false)
	private Integer relChefId;
	
	@Basic
	@Column(name = "DISH_NAME", nullable = false, unique = false)
	private String dishName;
	
	@Basic
	@Column(name = "DISH_DESCRIPTION", nullable = true, unique = false)
	private String dishDescription;
	
	@Basic
	@Column(name = "DISH_ING_DESCRIP", nullable = true, unique = false)
	private String dishIngDescrip;
	
	
	@Basic
	@Column(name = "DISH_PREP_DESCRIP", nullable = true, unique = false)
	private String dishPrepDescrip;
	
	@Basic
	@Column(name = "DISH_TYPE", nullable = true, unique = false)
	private Integer dishType;
	
	@Basic
	@Column(name = "DISH_VNV_TYPE", nullable = true, unique = false)
	private Integer dishVNVType;
	
	@Basic
	@Column(name = "DISH_ALLERG_INFO", nullable = true, unique = false)
	private Integer dishAllergInfo;
	
	@Basic
	@Column(name = "DISH_NUTRITION_INFO", nullable = true, unique = false)
	private Integer dishNutritionInfo;

	public Integer getIdDishMaster() {
		return idDishMaster;
	}

	public void setIdDishMaster(Integer idDishMaster) {
		this.idDishMaster = idDishMaster;
	}

	public Integer getRelCuisineId() {
		return relCuisineId;
	}

	public void setRelCuisineId(Integer relCuisineId) {
		this.relCuisineId = relCuisineId;
	}

	public Integer getRelChefId() {
		return relChefId;
	}

	public void setRelChefId(Integer relChefId) {
		this.relChefId = relChefId;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getDishDescription() {
		return dishDescription;
	}

	public void setDishDescription(String dishDescription) {
		this.dishDescription = dishDescription;
	}

	public String getDishIngDescrip() {
		return dishIngDescrip;
	}

	public void setDishIngDescrip(String dishIngDescrip) {
		this.dishIngDescrip = dishIngDescrip;
	}

	public String getDishPrepDescrip() {
		return dishPrepDescrip;
	}

	public void setDishPrepDescrip(String dishPrepDescrip) {
		this.dishPrepDescrip = dishPrepDescrip;
	}

	public Integer getDishType() {
		return dishType;
	}

	public void setDishType(Integer dishType) {
		this.dishType = dishType;
	}

	public Integer getDishVNVType() {
		return dishVNVType;
	}

	public void setDishVNVType(Integer dishVNVType) {
		this.dishVNVType = dishVNVType;
	}

	public Integer getDishAllergInfo() {
		return dishAllergInfo;
	}

	public void setDishAllergInfo(Integer dishAllergInfo) {
		this.dishAllergInfo = dishAllergInfo;
	}

	public Integer getDishNutritionInfo() {
		return dishNutritionInfo;
	}

	public void setDishNutritionInfo(Integer dishNutritionInfo) {
		this.dishNutritionInfo = dishNutritionInfo;
	}
	
	
	
	
}
