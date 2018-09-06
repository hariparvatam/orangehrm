package orangehrm.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orangehrm.base.Base_Setup;

public class Leave_Page extends Base_Setup {
	
	@FindBy(id="menu_leave_viewLeaveModule")
	WebElement leave;
	//@FindBy()
	
	public Leave_Page(){
		PageFactory.initElements(driver, this);
	}
	
	public void validateLeavePage(){
		
	}
	
	public void leavePage(){
		leave.click();
	}

}
