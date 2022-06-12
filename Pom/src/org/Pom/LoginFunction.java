package org.Pom;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunction {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace-Selenium\\Selenium_Course\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		
		PageObjectModel.login(driver).click();
		PageObjectModel.email(driver).sendKeys("dhinesh100295@gmail.com");
		PageObjectModel.password(driver).sendKeys("1234567");
		PageObjectModel.SubmitLogin(driver).click();
		
		
		
//		driver.findElement(By.className("login")).click();
//		driver.findElement(By.name("email")).sendKeys("dhinesh100295@gmail.com");
//		driver.findElement(By.id("passwd")).sendKeys("1234567");
//		driver.findElement(By.id("SubmitLogin")).click();
}
}