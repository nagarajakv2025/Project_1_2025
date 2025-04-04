package testCaseRepo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepo.ContactsPage;
import ObjectRepo.CreatingNewContactPage;
import ObjectRepo.HomePage;
import genericUtility.BaseClass;

@Listeners(genericUtility.ListenersImplementation.class)
public class TC_004 extends BaseClass{
	@Test(groups= {"Sanity", "Smoke"})
	public void CON_001() throws Exception
	{	
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();

		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreateNewContactIcon();
		
		String lName = eUtil.getDataFromExcelFile("Contacts", 2, 1);
		String title = eUtil.getDataFromExcelFile("Contacts", 2, 2);
		String department = eUtil.getDataFromExcelFile("Contacts", 2, 3);
		
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.createNewContact(lName, title, department);
		
	}
}
