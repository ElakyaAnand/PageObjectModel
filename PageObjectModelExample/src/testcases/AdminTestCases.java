package testcases;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjects.AdminPageObjects;
import pageobjects.LoginPageObjects;

public class AdminTestCases {



	@Test
	public void admincase() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		ob.manage().window().maximize();

		Thread.sleep(3000);
		
		
		PageFactory.initElements(ob, LoginPageObjects.class);
		LoginPageObjects.username.sendKeys("Admin");
		LoginPageObjects.password.sendKeys("admin123");
		LoginPageObjects.loginbutton.click();
		
		
		Thread.sleep(3000);
		
		PageFactory.initElements(ob, AdminPageObjects.class);
		
		
		Thread.sleep(3000);
	
		AdminPageObjects.adminlink.click();
		Thread.sleep(3000);
		AdminPageObjects.usernametextbox.sendKeys("Admin");
		Thread.sleep(3000);
		
		
		AdminPageObjects.userroleicon.click();
		Thread.sleep(3000);
		
		AdminPageObjects.adminlist.click();
		Thread.sleep(3000);
		AdminPageObjects.searchbutton.click();		
		
		
		
		/*
		 * WebElement Admin=ob.findElement(By.linkText("Admin")); Admin.click();
		 * Thread.sleep(3000);
		 * 
		 * 
		 * 
		 * WebElement usernamebox=ob.findElement(By.
		 * xpath("//label[text()='Username']//following::input[@class='oxd-input oxd-input--active']"
		 * )); usernamebox.sendKeys("Admin"); Thread.sleep(3000);
		 * 
		 * WebElement userroledropdown=ob.findElement(By.xpath(
		 * "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/i"
		 * )); userroledropdown.click();
		 * 
		 * 
		 * 
		 * WebElement adminlist=ob.findElement(By.xpath(
		 * "//div[@role='listbox']//div[2]//following-sibling::span[1]"));
		 * adminlist.click();
		 * 
		 * 
		 * WebElement searchbox=ob.findElement(By.xpath("//button[@type='submit']"));
		 * searchbox.click();
		 */
		

	}

}
