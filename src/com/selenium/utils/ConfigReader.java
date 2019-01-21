package com.selenium.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	
	public static String getBrowser()
	{
		return	getMyPropertyValue("browser");
	}
	
	public static String getUrl()
	{
		return getMyPropertyValue("url");
	}
	public static String getUserName()
	{
		return getMyPropertyValue("username");
	}
	public static String getPassword()
	{
		return getMyPropertyValue("password");
	}
	public static int getTimeOut()
	{
		return Integer.valueOf(getMyPropertyValue("timeout"));
	}
	
	private static String getMyPropertyValue(String propertyName)
	{
		File file = new File("data//config.properties");
		FileInputStream fis = null;
		String value = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties props = new Properties();
		
		try {
			props.load(fis);
			value =props.getProperty(propertyName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return value;
	}
}
