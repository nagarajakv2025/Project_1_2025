package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage{
//Finding WebElements
@FindBy(xpath="//img[@title='Create Organization...']")
private WebElement createNewOrganizationIcon;

//Initializing method
public OrganizationsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

//Getters method
public WebElement getCreateNewOrganizationIcon() {
	return createNewOrganizationIcon;
}

/**
 * business library to click on Create new Organization icon
 */
//Utilization
public void createNewOrganizationIcon()
{
	getCreateNewOrganizationIcon().click();
}

}
