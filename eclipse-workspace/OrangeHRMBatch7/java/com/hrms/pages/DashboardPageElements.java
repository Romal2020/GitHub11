package com.hrms.pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class DashboardPageElements extends BaseClass {

	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement pimLinkBtn;

	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement adminLinkBtn;

	@FindBy(id = "menu_leave_viewLeaveModule")
	WebElement leaveLinkBtn;

	@FindBy(id = "menu_time_viewTimeModule")
	WebElement timeLinkBtn;

	@FindBy(id = "menu_recruitment_viewRecruitmentModule")
	WebElement recruitmentLinkBtn;

	@FindBy(id = "menu_dashboard_index")
	WebElement dashboardLinkBtn;

	@FindBy(id = "menu_directory_viewDirectory")
	WebElement directoryLinkBtn;

	@FindBy(css = "a#welcome")
	public WebElement welcome;
	@FindBy(id = "menu_pim_addEmployee")
	public WebElement addEmpBtn;

	public void DashboardPageElements() {
		PageFactory.initElements(driver, this);

	}
}
