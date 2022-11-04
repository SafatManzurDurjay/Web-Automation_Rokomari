package webtests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import utilities.DriverSetup;

import webpages_of_rokomari.Rokomari_Home_Page;
import webpages_of_rokomari.Rokomari_Login_Page;

public class LoginTest extends DriverSetup {
	
    Rokomari_Home_Page  rokomari_Home_Page = new Rokomari_Home_Page();
	
	Rokomari_Login_Page rokomari_Login_Page = new Rokomari_Login_Page();
	
	@Test(priority = 0, description = "Home Page Loading Test with base URL")
	
	@Description("Test Description: Load website with base URL and maximize the window")
	
	public void TestHomePageUrl() {
		
		rokomari_Home_Page = new Rokomari_Home_Page();
		getDriver().get("https://www.rokomari.com/book");
		assertEquals(getDriver().getCurrentUrl(), "https://www.rokomari.com/book");
		rokomari_Home_Page.takescreenshot("Home Page");
		
	}
	@Test
	public void TestHomePageTitle() {
		
		rokomari_Home_Page = new Rokomari_Home_Page();
		getDriver().get("https://www.rokomari.com/book");
		assertEquals(getDriver().getTitle(), "Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com");
		rokomari_Home_Page.takescreenshot("Home Page1");
	}
		
	@Test
	public void loginTest() {
		
		getDriver().get("https://www.rokomari.com/book");
		rokomari_Home_Page.clickONLoginButton();
		//daraz_Login_Page.enterEmail("safatmanzur@gmail.com");
		//daraz_Login_Page.enterPassword("1234114477");
		rokomari_Login_Page.doLogin("safatmanzur@gmail.com", "12348765ab");
		rokomari_Login_Page.cliONLoginButton();
		assertEquals(getDriver().getTitle(), "Login To Rokomari | Rokomari.com");
		rokomari_Login_Page.takescreenshot("LoginPage");
		
	}
	
}
