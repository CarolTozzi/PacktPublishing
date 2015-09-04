package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookTitle {
	
	public static String getTitle(WebDriver browser){
		return browser.findElement(By.className("dotd-title")).getText();		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
