package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	public static void loginCredentials(WebDriver browser){
		browser.findElement(By.className("login-popup")).click();
		browser.findElement(By.id("email")).sendKeys("tozzi.carol@gmail.com");
		browser.findElement(By.id("password")).sendKeys("bsb104");
		browser.findElement(By.id("login-form-submit"));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
