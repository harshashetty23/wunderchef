package com.wunderchef.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chef_master")
public class ChefMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idCHEF_MASTER", nullable = false, unique = true)
	private Integer idChef_master;
	
	@Basic
	@Column(name = "CUSTOM_CHEF_NAME", nullable = false, unique = false)
	private String chef_name;
	
	@Basic
	@Column(name = "CHEF_DESCRIPTION", nullable = true, unique = false)
	private String chef_description;
	
	@Basic
	@Column(name = "CHEF_HISTORY", nullable = true, unique = false)
	private String chef_history;
	
	@Basic
	@Column(name = "CHEF_CATEGORY", nullable = true, unique = false)
	private String chef_category;

	public Integer getIdChef_master() {
		return idChef_master;
	}

	public void setIdChef_master(Integer idChef_master) {
		this.idChef_master = idChef_master;
	}

	public String getChef_name() {
		return chef_name;
	}

	public void setChef_name(String chef_name) {
		this.chef_name = chef_name;
	}

	public String getChef_description() {
		return chef_description;
	}

	public void setChef_description(String chef_description) {
		this.chef_description = chef_description;
	}

	public String getChef_history() {
		return chef_history;
	}

	public void setChef_history(String chef_history) {
		this.chef_history = chef_history;
	}

	public String getChef_category() {
		return chef_category;
	}

	public void setChef_category(String chef_category) {
		this.chef_category = chef_category;
	}
	
	
}
