package orangehrm.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orangehrm.base.Base_Setup;

public class Leave_Page extends Base_Setup {
	
	@FindBy(id="menu_leave_applyLeave")
	WebElement applyLeave;
	
	@FindBy(id="menu_leave_viewMyLeaveList")
	WebElement myLeave;
	@FindBy(id="menu_leave_viewLeaveModule")
	WebElement leaveLink;
	
	public Leave_Page(){
		PageFactory.initElements(driver, this);
	}
	public Leave_Page clickLeaveLink(){
		leaveLink.click();
		return new Leave_Page();
	}
	public ApplyLeavePage clickApplyLeaveLink(){
		applyLeave.click();
		return new ApplyLeavePage();
	}
	
	public Leave_Page clickMyLeaveLink(){
		myLeave.click();
		return new Leave_Page();
	}
}
