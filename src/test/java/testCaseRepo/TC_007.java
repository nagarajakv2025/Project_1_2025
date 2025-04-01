package testCaseRepo;

import org.testng.annotations.Test;

import ObjectRepo.CreatingNewOrganizationPage;
import ObjectRepo.HomePage;
import ObjectRepo.OrganizationsPage;
import genericUtility.BaseClass;

public class TC_007 extends BaseClass{
@Test(groups= {"Smoke"})
	public void ORG_001() throws Exception
	{
	HomePage hp = new HomePage(driver);
	hp.clickOnOrganizationsMenu();	
	
	OrganizationsPage orgp = new OrganizationsPage(driver);
	orgp.createNewOrganizationIcon();
	
	String orgName = eUtil.getDataFromExcelFile("Organizations", 2, 1);
	String industry = eUtil.getDataFromExcelFile("Organizations", 2, 2);
	String type = eUtil.getDataFromExcelFile("Organizations", 2, 3);
	
	CreatingNewOrganizationPage cnop = new CreatingNewOrganizationPage(driver);
	cnop.CreateNewOrganization(orgName, industry, type);

}
}
