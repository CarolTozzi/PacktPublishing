package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	
	
	public static WebDriver openBrowser (String browserName){
		if(browserName.equalsIgnoreCase("firefox")){
			FreeBook.browser = new FirefoxDriver();
		}
		return FreeBook.browser;
	}
	
	public static void closeBrowser (WebDriver browser){		
		FreeBook.browser.close();		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

}
