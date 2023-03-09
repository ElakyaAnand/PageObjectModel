package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCaseWithoutFindBy {
	
	
	public  WebElement username;
	public static WebElement password;
	
	@Test
	public void testleafground() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		PageFactory.initElements(ob, TestCaseWithoutFindBy.class);
		Thread.sleep(3000);
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		
	}

}
