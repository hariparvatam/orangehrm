package orangehrm.test;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import orangehrm.base.Base_Setup;
import orangehrm.page.Dashboard_Page;
import orangehrm.page.Home_Page;
import orangehrm.page.Login_Page;

public class Login_Test extends Base_Setup {
	Login_Page login;
	Home_Page homePage;
	
	public Login_Test(){
		super();
	}
	@BeforeMethod
	public void setUp(){
		initilization();
		login=new Login_Page();
	}
	@Test(priority=1)
	public void loginTest(){
		homePage=login.login(prop.getProperty("username"),prop.getProperty("pass"));
		String str=login.loginPageValidation();
		Assert.assertEquals(str, "Welcome TestingMasters");
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

}
