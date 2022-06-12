package org.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectModel {
	
	public static WebElement login(WebDriver driver) {
		return driver.findElement(By.className("login"));
	}
	
	public static WebElement email(WebDriver driver) {
		return driver.findElement(By.name("email"));
		
	}
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("passwd"));
		
	}
	public static WebElement SubmitLogin(WebDriver driver) {
		return driver.findElement(By.id("SubmitLogin"));
		
	}

}
