package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is a contacts page POM class
 * @author user
 * @version 25.03.11
 */
public class ContactsPage {
	//Finding Web Elements
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createNewContactIcon;
	//Initializing method
	public ContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Getter Method
	public WebElement getCreateNewContactIcon() 
	{
		return createNewContactIcon;
	}
	
	/**
	 * This is a business library to click on Create new contact icon
	 */
	//Utilization 
	public void clickOnCreateNewContactIcon()
	{
		getCreateNewContactIcon().click();
	}
}
