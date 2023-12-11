package POMFiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	WebDriverWait wait;
	JavascriptExecutor js;
	@FindBy(xpath="//a[normalize-space()='Our Story']") private WebElement ourstory;
	@FindBy(xpath="(//div[@class='button-links']//a)[1]") private WebElement RDB;
	@FindBy(xpath="//a[normalize-space()='Our Solution']") private WebElement oursolution;
	@FindBy(xpath="//a[normalize-space()='Why Tendable?']") private WebElement whytendable;
	@FindBy(xpath="//a[text()='Contact Us']") private WebElement cu;
	
	By requestdemobutton=By.xpath("(//div[@class='button-links']//a)[1]");
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		js = (JavascriptExecutor)driver;
	}
	

	public void requestbutton()
	{
			
		
		//WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(requestdemobutton));
		//button.click();
		try
		{
			if(RDB.isEnabled() && RDB.isDisplayed())
			{
				js.executeScript("arguments[0].click();", RDB);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void clickOnOur_Story()
	{
		ourstory.click();
	}
	public void clickonOur_solution()
	{
		oursolution.click();
	}
	public void clickonWhy_tendeble()
	{
		whytendable.click();
	}
	public void clickOncontactus()
	{
		cu.click();
	}
}
