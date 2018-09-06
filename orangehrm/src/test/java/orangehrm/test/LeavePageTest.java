package orangehrm.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import orangehrm.base.Base_Setup;
import orangehrm.page.ApplyLeavePage;
import orangehrm.page.Home_Page;
import orangehrm.page.Leave_Page;
import orangehrm.page.Login_Page;

public class LeavePageTest extends Base_Setup{
	Home_Page homePage;
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
		homePage=login.login(prop.getProperty("username"), prop.getProperty("pass"));
		leavePage.clickLeaveLink();
	}
	
	@Test(priority=1)
	public void verifyClickApplyLeaveLink(){
		leavePage.clickApplyLeaveLink();
	}
	@Test(priority=2)
	public void verifyClickMyLeaveLink(){
		leavePage.clickMyLeaveLink();
	}

}
