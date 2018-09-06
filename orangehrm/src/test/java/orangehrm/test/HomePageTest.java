package orangehrm.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import orangehrm.base.Base_Setup;
import orangehrm.page.Dashboard_Page;
import orangehrm.page.Home_Page;
import orangehrm.page.Login_Page;
import orangehrm.page.MyInfo;
import orangehrm.page.My_Leave_Page;
import orangehrm.page.Timesheets_Page;

public class HomePageTest extends Base_Setup{
	Login_Page login;
	Home_Page homePage;
	My_Leave_Page leavePage;
	Timesheets_Page timeSheetPage;
	MyInfo myInfo;
	public HomePageTest(){
		super();
	}
	@BeforeMethod
	public void setUp(){
		initilization();
		login=new Login_Page();
		homePage=login.login(prop.getProperty("username"), prop.getProperty("pass"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTest(){
		String text=homePage.loginPageValidation();
		Assert.assertEquals(text, "Welcome TestingMasters","Home page member login name not displayed");
	}
	@Test(priority=2)
	public void verifyclickLeaveLinkTest(){
		leavePage=homePage.clickLeaveLink();
	}
	@Test(priority=3)
	public void verifyClickTimeLinkPage(){
		timeSheetPage=homePage.clickTimeLinkPage();
	}
	@Test(priority=4)
	public void verifyClickMyInfoLinkPage(){
		myInfo=homePage.clickMyInfoLinkPage();
	}
	@Test(priority=5)
	public void veriftClickDashboardLinkPage(){
		homePage.clickDashboardLinkPage();
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}


}
