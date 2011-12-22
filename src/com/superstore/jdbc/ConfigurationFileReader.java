package com.superstore.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;





public class ConfigurationFileReader {
	static ConfigurationFileReader configurationFileReader = new ConfigurationFileReader();
	static HashMap<String, String> databasePropertiesHashMap = new HashMap<String, String>();
	//static HashMap<String, String> reminderPropertiesHashMap = new HashMap<String, String>();
	//static Logger configFileReaderLog =  new  CPWReminderLog(ConfigurationFileReader.class).getInstance();
	

	
	
  public ConfigurationFileReader readFile()
	{
		
	  System.out.println("loading");
		//testLOG.info();
		FileInputStream databaseInputFile = null;
		Properties databaseProperties = new Properties();

		

	      
	      
			

			try{
			databaseInputFile = new FileInputStream("C:/JAVA/Workspace/SuperStore/SuperStore/WebContent/config/DatabaseConfigurationFile.properties");
			
			}
			catch(FileNotFoundException ex)
			{
				System.out.println("amp d nkita");
				ex.printStackTrace();
			}
			
			try {
				databaseProperties.load(databaseInputFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			
			

	

		Set<String> databasePropertySet = databaseProperties.stringPropertyNames();



		databasePropertiesHashMap = setHashValue(databasePropertySet, databaseProperties);
		
		
		return configurationFileReader;
		
		
		
		
}
	
	private static HashMap<String, String> setHashValue(
			Set<String> propertySet, Properties propertiesTest) {
		
		HashMap<String, String> PropertiesHashMap = new HashMap<String, String>();

		String hashKey, hashValue;
		Iterator<String> iterateSet = propertySet.iterator();

		while (iterateSet.hasNext()) {
			hashKey = iterateSet.next();
			hashValue = propertiesTest.getProperty(hashKey);
			PropertiesHashMap.put(hashKey, hashValue);

		}

		return PropertiesHashMap;

	}

	public HashMap<String, String> readDatabaseHashMapProperties() {
		
		return databasePropertiesHashMap;
		

	}
	


	public static ConfigurationFileReader getInstance()
	{
		
		return configurationFileReader;
	}
	

}
