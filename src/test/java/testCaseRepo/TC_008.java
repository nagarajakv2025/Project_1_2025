package testCaseRepo;

import org.testng.annotations.Test;

import ObjectRepo.CreatingNewOrganizationPage;
import ObjectRepo.HomePage;
import ObjectRepo.OrganizationsPage;
import genericUtility.BaseClass;

public class TC_008 extends BaseClass{
@Test(groups= {"Sanity"})
	public void ORG_002() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnOrganizationsMenu();
		
		OrganizationsPage orgp = new OrganizationsPage(driver);
		orgp.createNewOrganizationIcon();
		
		String orgName = eUtil.getDataFromExcelFile("Organizations", 5, 1);
		String industry = eUtil.getDataFromExcelFile("Organizations", 5, 2);
		String type = eUtil.getDataFromExcelFile("Organizations", 5, 3);
		String rating = eUtil.getDataFromExcelFile("Organizations", 5, 4);
		
		CreatingNewOrganizationPage cnop = new CreatingNewOrganizationPage(driver);
		cnop.CreateNewOrganization(orgName, industry, type, rating);
		
	}
}
