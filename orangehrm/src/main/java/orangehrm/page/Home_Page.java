package orangehrm.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orangehrm.base.Base_Setup;

public class Home_Page extends Base_Setup{
	@FindBy(linkText="Welcome TestingMasters")
	WebElement usernamelable;
	@FindBy(xpath="//a[@id='menu_leave_viewLeaveModule']")
	WebElement leaveLink;
	@FindBy(id="menu_time_viewTimeModule")
	WebElement timeLink;
	@FindBy(id="menu_pim_viewMyDetails")
	WebElement myInfoLink;
	@FindBy(id="menu_dashboard_index")
	WebElement dashboardLink;
	
	public Home_Page(){
		PageFactory.initElements(driver, this);
	}
	public String loginPageValidation(){
		return usernamelable.getText();
	}
	
	public My_Leave_Page clickLeaveLink(){
		leaveLink.click();
		return new My_Leave_Page();
	}
	public Timesheets_Page clickTimeLinkPage(){
		timeLink.click();
		return new Timesheets_Page();
	}
	public MyInfo clickMyInfoLinkPage(){
		myInfoLink.click();
		return new MyInfo();
	}
	public Dashboard_Page clickDashboardLinkPage(){
		dashboardLink.click();
		return new Dashboard_Page();
	}
	


}
