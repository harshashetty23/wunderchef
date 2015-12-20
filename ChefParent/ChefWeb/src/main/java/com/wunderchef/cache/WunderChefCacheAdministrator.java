package com.wunderchef.cache;

import java.util.Properties;

import com.opensymphony.oscache.general.GeneralCacheAdministrator;

public class WunderChefCacheAdministrator extends GeneralCacheAdministrator{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WunderChefCacheAdministrator(){
		Properties p = new Properties();
	
	}
	
	  public WunderChefCacheAdministrator(Properties p) {
	        super(p);
	       
	   }
}
