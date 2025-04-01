package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatingNewOrganizationPage {
//Locating WebElements	
@FindBy	(xpath="//input[@name='accountname']")
private WebElement organizationNameTextFeild;
@FindBy	(xpath="//select[@name='industry']")
private WebElement industryDropdown;
@FindBy	(xpath="//select[@name='accounttype']")
private WebElement typeDropdown;
@FindBy	(xpath="//select[@name='rating']")
private WebElement ratingDropdown;
@FindBy	(xpath="//input[@name='assigntype' and @value='T']")
private WebElement AssignedToRadioButton;
@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement saveButton;

//Initializing WebElement
public CreatingNewOrganizationPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

//Getters
public WebElement getOrganizationNameTextFeild() 
{
	return organizationNameTextFeild;
}

public WebElement getIndustryDropdown() 
{
	return industryDropdown;
}

public WebElement getTypeDropdown() 
{
	return typeDropdown;
}

public WebElement getRatingDropdown() 
{
	return ratingDropdown;
}

public WebElement getAssignedToRadioButton() 
{
	return AssignedToRadioButton;
}

public WebElement getSaveButton() 
{
	return saveButton;
}
//Utilization

//Org_001
public void CreateNewOrganization(String organizationName, String industry, String type)
{
	getOrganizationNameTextFeild().sendKeys(organizationName);
	Select ind= new Select(getIndustryDropdown());
	ind.selectByValue(industry);
	Select typ= new Select(getTypeDropdown());
	typ.selectByValue(type);
	getSaveButton().click();
}

//Org_002
public void CreateNewOrganization(String organizationName, String industry, String type, String Rating)
{
	getOrganizationNameTextFeild().sendKeys(organizationName);
	Select ind= new Select(getIndustryDropdown());
	ind.selectByValue(industry);
	Select typ= new Select(getTypeDropdown());
	typ.selectByValue(type);
	Select rat= new Select(getRatingDropdown() );
	rat.selectByValue(Rating);
	getSaveButton().click();
}

//Org_003
public void CreateNewOrganization(String organizationName, String industry, String type, String rating, String assiggnedTo)
{
	getOrganizationNameTextFeild().sendKeys(organizationName);
	Select ind= new Select(getIndustryDropdown());
	ind.selectByValue(industry);
	Select typ= new Select(getTypeDropdown());
	typ.selectByValue(type);
	Select rat= new Select(getRatingDropdown() );
	rat.selectByValue(rating);
	getAssignedToRadioButton().click();
	getSaveButton().click();
}

}

