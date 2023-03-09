package pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPageObjects {
	
	
	
	@FindBy(xpath="//input[@name='username']")
	public static WebElement username;
	
	
	@FindBy(xpath = "//input[@name='password']")
	public static WebElement password;
	
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement loginbutton;
	
	
	
	
	/*
	 * public static WebElement username(WebDriver ob) { return
	 * ob.findElement(By.xpath("//input[@name='username']"));
	 * 
	 * }
	 * 
	 * 
	 * public static WebElement password(WebDriver ob) { return
	 * ob.findElement(By.xpath("//input[@name='password']"));
	 * 
	 * }
	 * 
	 * public static WebElement loginbutton(WebDriver ob) { return
	 * ob.findElement(By.xpath("//button[@type='submit']"));
	 * 
	 * }
	 */
	

}
