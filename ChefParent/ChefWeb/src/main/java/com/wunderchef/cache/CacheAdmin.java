package com.wunderchef.cache;


import java.util.Properties;

//import javax.annotation.Resource;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;




import com.opensymphony.oscache.base.NeedsRefreshException;
import com.opensymphony.oscache.util.StringUtil;

public class CacheAdmin {
	
	
	public CacheAdmin(){
		
		logger.error(" the class is initializing ");
	}
	
	@Autowired
	private WunderChefCacheAdministrator wunderChefCacheAdministrator;
	
	private Properties props;
	
	String key;
	
	/*public Properties getProps() {
		return props;
	}
	
	@Resource(name="myAccountProps")
	public void setProps(Properties props) {
		this.props = props;
	}*/
	
	private static final Logger logger = LoggerFactory.getLogger(CacheAdmin.class);
	
 	//boolean isTraceEnabled = true;
		 
	public void putInCache( String key, Object value) throws CacheManagerException { 
		 
	        //long start=System.currentTimeMillis();
	       // logger.info("The Maximum Capacity of Cache Administrator Is " + webExCacheAdministrator.getProperty(WebExCacheAdministrator.CACHE_CAPACITY_KEY));
	        if (getBooleanPropertyValue("keyset")) { 
	            try { 
		            	if (StringUtil.isEmpty(key)) { 
			                throw new CacheManagerException("Key cannot be null"); 
			            } 
			            if (value == null) { 
			                throw new CacheManagerException("Value cannot be null"); 
			            } 
	                   	CachedObjectWrapper cow = new CachedObjectWrapper();
	                  	cow.setKey(key);
	                  	cow.setValue(value);
	                  	wunderChefCacheAdministrator.putInCache(key, cow); 
	                 // 	long end =System.currentTimeMillis();
	                   
	                  	//logger.info(" New cache added for the key "+key +".") ;
	                  //	logger.info(" total time it takes store the content in the cache "+(end-start));

	                   
	            }catch (Exception e) { 
	            	
	            	wunderChefCacheAdministrator.cancelUpdate(key); 
	                throw new CacheManagerException("Could not update cache: " + e.getMessage(), e); 
	            }  
	        }
	        else
	        {
	        	//logger.info("OSCache is Not Enabled from Property.");
	        }
	 } 
  
	 public Object getFromCache(String key) throws CacheManagerException {
		 
		 int cacheRefreshPeriod = 604800;
		 return getFromCache(key,cacheRefreshPeriod);
	 }

	
	 
	 public Object getFromCache(String key,int cacheRefreshPeriod) throws CacheManagerException { 
		 
		 //logger.info("CacheAdmin:Entering into getFromCache");
		 //logger.info("Cache Refresh Period in Seconds " + cacheRefreshPeriod);
	     //logger.info("CacheAdmin:Cache Administrator Size is ::"+wunderChefCacheAdministrator.getCache().getSize());
         Object result = null; 
	     boolean updated = false; 
         if (getBooleanPropertyValue("true")) { 
	            try { 
	            	if (StringUtil.isEmpty(key)) { 
		                throw new CacheManagerException("key cannot be null"); 
		            }
	            	CachedObjectWrapper cow =(CachedObjectWrapper) wunderChefCacheAdministrator.getFromCache(key, cacheRefreshPeriod); 
 	                if (cow != null && cow.getKey().equals(key)) { 
 	                	result = cow.getValue(); 
	                    updated = true; 
	                } 
 	                if (result != null) { 
 	                    // logger.info("Object with key: " + key + " already exists in cache. Returning previously stored item"); 
 	                } else { 
 	                    //    logger.info("Object with key: " + key + " does not exist in cache."); 
 	                } 
 	                
	            } catch(NeedsRefreshException nre){
	            	//logger.error("NeedsRefreshException Thrown While Reading the Object from Cache.");
	            }   
	            finally{
            		if(!updated){
            			wunderChefCacheAdministrator.cancelUpdate(key);
	                        //logger.info("Inside getFromCache catch Block. cancelUpdate is not enabled. will block other thread."  );
	 	                    // essential that this is called when stale  object exists in cache 


            		}
            	}
	        }
         	else
	        {
	        	//logger.info("OSCache is Not Enabled from Property.");
	        }
 	        return result; 
	    } 
 
 
	 public void clearCache(){
		
		 //logger.info("Removing all the cache values from the cache"); 
		 wunderChefCacheAdministrator.flushAll();
 	 }
	 
	 public void clearCache(String key)
	 {
		 //logger.info("Removing the cached object from the oscache for the key : {}", key);
		 wunderChefCacheAdministrator.flushEntry(key);
	 }

		
	public String getPropertyValue(String propertyKey){
 		//logger.info(" The key is "+ propertyKey+" and the value is "+props.getProperty(propertyKey));
		return props.getProperty(propertyKey);
	}
	
	public boolean  getBooleanPropertyValue(String propertyKey){
 		//logger.info(" The key is "+ propertyKey+" and the value is "+props.getProperty(propertyKey));
		//return props.getProperty(propertyKey).equals("true")?true:false;
		return true;
	}
	
	
	public int   getIntPropertyValue(String propertyKey){ 
		//logger.info(" The key is "+ propertyKey+" and the value is "+props.getProperty(propertyKey));
		return Integer.parseInt(props.getProperty(propertyKey)); 
	}
	
	
	public void getCacheStatistics(){
		
	}
	
}
