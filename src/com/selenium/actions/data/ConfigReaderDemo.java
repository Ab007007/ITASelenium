package com.selenium.actions.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReaderDemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("data//config.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties props = new Properties();
		
		props.load(fis);
			
		String myurl = props.getProperty("url");
		String un = props.getProperty("username");	
		String pwd = props.getProperty("password");
		String br = props.getProperty("browser");
		String tout = props.getProperty("timeout");
		
		System.out.println(myurl + "\n" + un+ "\n" + pwd+ "\n" + br+ "\n" + tout);
		
		
		fis.close();
			
	}
	
	
}
