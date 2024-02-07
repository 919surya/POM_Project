package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {
	
	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/section/div/div[2]/div/div[1]/div[1]/div/div/header/div")WebElement NEW_CUSTOMER_HEADER;
	@FindBy(how=How.XPATH,using="//*[@id=\"general_compnay\"]/div[1]/div/input")WebElement FULLNAME_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"general_compnay\"]/div[2]/div/select")WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"general_compnay\"]/div[3]/div/input")WebElement EMAIL_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"phone\"]")WebElement PHONE_NUMBER_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"general_compnay\"]/div[5]/div/input")WebElement ADDRESS_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"general_compnay\"]/div[6]/div/input")WebElement CITY_ELEMENT;
	
	public void validateAddContactPage(String newCustomerHeader) {
		Assert.assertEquals(NEW_CUSTOMER_HEADER.getText(),newCustomerHeader, "New Customer Page is not available");
	}
	
	public void insertFullName(String fullName) {
		int genNum=generateRandomNo(999);
		FULLNAME_ELEMENT.sendKeys(fullName+genNum);
		
	}
	public void selectCompany(String company) {
		SelectFromDropdown(COMPANY_DROPDOWN_ELEMENT,company);
		
	}
	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNo(9999)+email);
		
	}


	

}
