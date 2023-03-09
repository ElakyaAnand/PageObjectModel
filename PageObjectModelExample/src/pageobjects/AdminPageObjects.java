package pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AdminPageObjects {
	
	
	@FindBy(linkText = "Admin")
	public static WebElement adminlink;

	

	
	@FindBy(xpath="//label[text()='Username']//following::input[@class='oxd-input oxd-input--active']")
	public static WebElement usernametextbox;

	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/i")
	public static WebElement userroleicon;
	
	
	
	@FindBy(xpath="//div[@role='listbox']//div[2]//following-sibling::span[1]")
	public static WebElement adminlist;
	
	
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement searchbutton;
	

}
