package testcases;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjects.LoginPageObjects;

public class ExampleOrangeHRM {
	
	@Test
	public  void orangehrmlogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		PageFactory.initElements(ob, LoginPageObjects.class);
		
		LoginPageObjects.username.sendKeys("Admin");
		LoginPageObjects.password.sendKeys("admin123");
		LoginPageObjects.loginbutton.click();
		
		
		/*
		 * WebElement username=ob.findElement(By.xpath("//input[@name='username']"));
		 * username.sendKeys("Admin");
		 * 
		 * WebElement password=ob.findElement(By.xpath("//input[@name='password']"));
		 * password.sendKeys("admin123");
		 * 
		 * WebElement loginbutton=ob.findElement(By.xpath("//button[@type='submit']"));
		 * loginbutton.click();
		 */
				
		
	}

}
