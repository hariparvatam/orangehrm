package orangehrm.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orangehrm.base.Base_Setup;

public class Login_Page extends Base_Setup{
	public static String text = null;
	@FindBy(id="txtUsername")
	WebElement user_name;
	@FindBy(id="txtPassword")
	WebElement password;
	@FindBy(id="btnLogin")
	WebElement login;
	
	@FindBy(linkText="Welcome TestingMasters")
	WebElement link;
	
	public Login_Page(){
		PageFactory.initElements(driver, this);
	}
	public String loginPageValidation(){
	return link.getText();
	}
	public Dashboard_Page login(String username, String pass){
		user_name.sendKeys(username);
		password.sendKeys(pass);
		login.click();
		
		return new Dashboard_Page();
	}

}
