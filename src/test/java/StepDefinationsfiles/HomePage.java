package StepDefinationsfiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;
import rst.pdfbox.layout.text.Position;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import POMFiles.ContactUSpage;
import POMFiles.Homepage;

public class HomePage {
	 public WebDriver driver;
	 public Homepage hp;
	 public ContactUSpage cu;
	@Given("Open the browser with application")
	public void open_the_browser_with_application() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://www.tendable.com/");
	    driver.manage().window().maximize();
		
	}

	@When("user landing on homepage")
	public void user_landing_on_homepage() {
		String title = driver.getTitle();
		hp=new Homepage(driver);
		
		Assert.assertEquals(title, "Quality Improvement App | Health and Social Care | Tendable");
		
	
	}
	@Then("verify on homepage and Request a Demo")
	public void verify_on_homepage_and_request_a_demo() {
	    
		hp.requestbutton();
	}

	@Then("verify user can access Our Story	menu Request a Demo")
	public void verify_user_can_access_our_story_menu_request_a_demo() {
	    hp.clickOnOur_Story();
	   String ourstorypage = driver.getTitle();
	   Assert.assertEquals(ourstorypage, "Quality Improvement App | Health and Social Care | Tendable");
	   hp.requestbutton();
	}

	@Then("verfiy user can access Our Solution menu Request a Demo")
	public void verfiy_user_can_access_our_solution_menu_request_a_demo() {
	   hp.clickonOur_solution();
	   String oursolutionpage = driver.getTitle();
	   Assert.assertEquals(oursolutionpage, "Quality Improvement App | Health and Social Care | Tendable");
	   hp.requestbutton();
	}

	@Then("verify user can access Why Tendable menu Request a Demo")
	public void verify_user_can_access_why_tendable_menu_request_a_demo() {
	    hp.clickonWhy_tendeble();
	    String tendble = driver.getTitle();
	    Assert.assertEquals(tendble, "Quality Improvement App | Health and Social Care | Tendable");
	    hp.requestbutton();
	}

	@When("nevigate to the Contact Us section and choose Marketing")
	public void nevigate_to_the_contact_us_section_and_choose_marketing() {
		Homepage hp2=new Homepage(driver);
		hp2.clickOncontactus();
		
	   
	}

	@When("complete marketing for with required details exclude massage field submite form")
	public void complete_marketing_for_with_required_details_exclude_massage_field_submite_form(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> data = dataTable.asMaps();
		String str = data.get(0).get("fullName");
		cu=new ContactUSpage(driver);
		cu.ClickOnContact();
		cu.EnterFullName(str);
		cu.EnterORGName(data.get(0).get("orgName"));
		cu.EnterphoneNo(data.get(0).get("PhoneNo"));
		cu.EnterEmailID(data.get(0).get("Email"));
		cu.selectRole();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement ele = cu.agree();
		js.executeScript("arguments[0].click();", ele);
		WebElement element = cu.submitform();
		js.executeScript("arguments[0].click();", element);
	}

	@Then("verify error massage")
	public void verify_error_massage() throws InterruptedException {
	    Thread.sleep(2000);
	    Assert.assertTrue(cu.getErrorMassage());
	}
}
