package com.selenium;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FreeBook {
	static WebDriver browser;
	static String titleOfBook = null;

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chosenBrowser = "firefox";


		Browser.openBrowser(chosenBrowser);
		browser.get("https://www.packtpub.com/packt/offers/free-learning");

		titleOfBook = BookTitle.getTitle(browser);

		if(!PopupWindow.createWindow("TEST")){
			System.out.println("Vai fechar");
			Browser.closeBrowser(browser);
		}else{
			Login.loginCredentials(browser);
			browser.findElement(By.cssSelector("html.js body#ppv4.with-logo.gh7ssmo.g-vj9dy9 div.respoPage div#page div#main-container.not-front.logged-in.page-node.node-type-free-learning-page.no-sidebars.page-packt-offers-free-learning.section-packt.node-full-view div#main div#content div div.section-outer.white.vpadding.cf div#deal-of-the-day.cf div.dotd-main-book.cf div.section-inner div.dotd-main-book-summary.float-left div.dotd-main-book-form.cf div.float-left.free-ebook a.twelve-days-claim div.book-claim-token-inner input.form-submit")).click();
			Browser.closeBrowser(browser);
		}
	}

}
