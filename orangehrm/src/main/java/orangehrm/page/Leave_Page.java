package orangehrm.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orangehrm.base.Base_Setup;

public class Leave_Page extends Base_Setup {
	
	@FindBy(id="menu_leave_applyLeave")
	WebElement applyLeave;
	

	@FindBy(id="menu_leave_viewLeaveModule")
	WebElement leaveLink;
	
	public Leave_Page(){
		PageFactory.initElements(driver, this);
	}
	public My_Leave_Page clickLeaveLink(){
		leaveLink.click();
		return new My_Leave_Page();
	}
	public ApplyLeavePage clickApplyLeaveLink(){
		applyLeave.click();
		return new ApplyLeavePage();
	}
	

	
}
