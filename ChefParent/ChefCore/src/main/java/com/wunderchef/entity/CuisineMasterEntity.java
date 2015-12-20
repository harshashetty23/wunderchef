package com.wunderchef.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cuisine_master")
public class CuisineMasterEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idCUISINE_MASTER", nullable = false, unique = true)
	private Integer idCuisine_master;
	
	@Basic
	@Column(name = "CUISINE_NAME", nullable = false, unique = false)
	private String cusine_name;
	
	@Basic
	@Column(name = "REL_PARENT_CUISINE_ID", nullable = true, unique = false)
	private Integer rel_parent_id;

	public Integer getIdCuisine_master() {
		return idCuisine_master;
	}

	public void setIdCuisine_master(Integer idCuisine_master) {
		this.idCuisine_master = idCuisine_master;
	}

	public String getCusine_name() {
		return cusine_name;
	}

	public void setCusine_name(String cusine_name) {
		this.cusine_name = cusine_name;
	}

	public Integer getRel_parent_id() {
		return rel_parent_id;
	}

	public void setRel_parent_id(Integer rel_parent_id) {
		this.rel_parent_id = rel_parent_id;
	}
	
	
}
