package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;
	
	@Test
	public void userShouldBeAbleToCreatNewCustomer() throws InterruptedException {
		driver=BrowserFactory.init();
		
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		 loginPage.insertUserName("demo@codefios.com");
		 loginPage.insertPassword("abc123");
		 loginPage.clickSigninButton();
		 
		 DashboardPage dashboardPage=PageFactory.initElements(driver, DashboardPage.class);
		 dashboardPage.validateDashboardPage("Dashboard");
		 dashboardPage.clickCustomersMenuElement();
		 dashboardPage.clickAddcustomerMenuElement();
		
		 
		 AddCustomerPage addCustomerPage=PageFactory.initElements(driver, AddCustomerPage.class);
		 addCustomerPage.validateAddContactPage("New Customer");
		 Thread.sleep(3000);
		 addCustomerPage.insertFullName("Selenium");
		 addCustomerPage.selectCompany("Techfios");
		 addCustomerPage.insertEmail("abc@techfios.com");
	}

}
