package webpages_of_rokomari;

import org.openqa.selenium.By;

public class Rokomari_Login_Page extends Base_Page {
	private By EMAIL = By.xpath("//input[@id='j_username']");
	private By PASSWORD = By.xpath("//input[@id='j_password']");
	private By LOGIN = By.xpath("//a[@class='logged-out-user-menu-btn btn btn-secondary']");
	
	public void enterEmail(String email) {
		
		writeText(EMAIL, email);
		
	}
	
	public void enterPassword(String password) {
		
		writeText(PASSWORD, password);
	}
	
    public void cliONLoginButton() {
		
		clickOnElement(LOGIN);
	}
    
    public void doLogin(String email, String password) {
    	
    	writeText(EMAIL, email);
    	writeText(PASSWORD, password);
    	cliONLoginButton();
    	   	
    	
    } 
}
