package com.tops.ExcelMaven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Properties prop = new Properties();

	        try {
	            // Load the properties file
	            FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
	            prop.load(fis);

	            // Read individual properties
	            String browser = prop.getProperty("browser");
	            String url = prop.getProperty("url");
	            String username = prop.getProperty("username");
	            String password = prop.getProperty("password");

	            // Use them as needed
	            System.out.println("Browser: " + browser);
	            System.out.println("URL: " + url);
	            System.out.println("Username: " + username);
	            System.out.println("Password: " + password);

	        } catch (IOException e) {
	            System.out.println("Failed to load config.properties file");
	            e.printStackTrace();
	        }

	}

}
