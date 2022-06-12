package org.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.PageFactory;

public class LoginFunction1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace-Project\\Pom\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		//PageFactory.initElements(driver, PageObjectModel2.class);
		
		PageFactory.initElements(driver, PageObjectModel2.class);
		
		PageObjectModel2.login.click();
		PageObjectModel2.email.sendKeys("dhinesh100295@gmail.com");
		PageObjectModel2.password.sendKeys("1234567");
		PageObjectModel2.submitLogin.click();
	}	
}
