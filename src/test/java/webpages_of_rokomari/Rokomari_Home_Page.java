package webpages_of_rokomari;

import org.openqa.selenium.By;



public class Rokomari_Home_Page extends Base_Page{
	   private By SIGNUPLOGINBUTTON = By.cssSelector("button[onclick=\"gtag('event', 'login', { method: 'GENERIC'});\"]");
		
		public void clickONLoginButton() {
			
			clickOnElement(SIGNUPLOGINBUTTON);
			
			

}

}