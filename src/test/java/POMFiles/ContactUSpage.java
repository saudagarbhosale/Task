package POMFiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUSpage {

	

	@FindBy(xpath="(//button[text()='Contact'])[1]") private WebElement contactButton;
	@FindBy(id="form-input-fullName") private WebElement FN;
	@FindBy(id="form-input-organisationName") private WebElement On;
	@FindBy(id="form-input-cellPhone") private WebElement phone;
	@FindBy(id="form-input-email") private WebElement email;
	@FindBy(id="form-input-message") private WebElement msg;
	@FindBy(id="form-input-jobRole") private WebElement list;
	@FindBy(id="form-input-consentAgreed-0") private WebElement agree;
	@FindBy(name="form_page_submit") private WebElement sub;
	@FindBy(xpath="//div[@class='ff-form-errors']//p") private WebElement err;
	
	
	By requestdemobutton=By.xpath("(//div[@class='button-links']//a)[1]");
	
	public ContactUSpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		}
	public void ClickOnContact()
	{
		contactButton.click();
	}
	public void EnterFullName(String str)
	{
		FN.sendKeys(str);
	}
	public void EnterORGName(String str)
	{
		On.sendKeys(str);
	}
	public void EnterphoneNo(String str)
	{
		phone.sendKeys(str);
	}
	public void EnterEmailID(String str)
	{
		email.sendKeys(str);
	}
	public void Entermassage(String str)
	{
		msg.sendKeys(str);
	}
	public void selectRole() 
	{
		Select s=new Select(list);
		s.selectByIndex(3);
		
		
	}
	public WebElement agree()
	{
		return agree;
	}
	public WebElement submitform()
	{
		return sub;
	}
	public boolean getErrorMassage()
	{
		String text = err.getText();
		System.out.println(text);
		return true;
	}
}
