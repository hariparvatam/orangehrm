package orangehrm.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import orangehrm.base.Base_Setup;
import orangehrm.page.ApplyLeavePage;
import orangehrm.page.Dashboard_Page;
import orangehrm.page.Leave_Page;
import orangehrm.page.Login_Page;

public class LeavePageTest extends Base_Setup{
	Dashboard_Page dashbaordPage;
	Login_Page login;
	Leave_Page leavePage ;
	public LeavePageTest(){
		super();
	}
	@BeforeMethod
	public void setUp(){
		initilization();
		login=new Login_Page();
		leavePage=new Leave_Page();
		dashbaordPage=login.login(prop.getProperty("username"), prop.getProperty("pass"));
		leavePage.clickLeaveLink();
	}
	
	@Test
	public void verifyClickApplyLeaveLink(){
		leavePage.clickApplyLeaveLink();
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
