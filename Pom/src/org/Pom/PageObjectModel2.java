package org.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectModel2 {

	@FindBy(className="login")
	
	public static WebElement login;
	
	@FindBy(name="email")
	public static WebElement email;
	
	@FindBy(id="passwd")
	public static WebElement password;
	
	@FindBy(id="SubmitLogin")
	public static WebElement submitLogin;
	

}
//driver.findElement(By.className("login")).click();
//driver.findElement(By.name("email")).sendKeys("dhinesh100295@gmail.com");
//driver.findElement(By.id("passwd")).sendKeys("1234567");
//driver.findElement(By.id("SubmitLogin")).click();