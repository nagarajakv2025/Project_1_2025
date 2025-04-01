package testCaseRepo;

import java.io.IOException;

import org.testng.annotations.Test;

import ObjectRepo.CreatingNewOrganizationPage;
import ObjectRepo.HomePage;
import ObjectRepo.OrganizationsPage;
import genericUtility.BaseClass;

public class TC_009 extends BaseClass{
	@Test(groups= {"Regression"})
	public void ORG_003() throws IOException, Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnOrganizationsMenu();
		
		OrganizationsPage orgp = new OrganizationsPage(driver);
		orgp.createNewOrganizationIcon();
		
		String orgName = eUtil.getDataFromExcelFile("Organizations", 8, 1);
		String industry = eUtil.getDataFromExcelFile("Organizations", 8, 2);
		String type = eUtil.getDataFromExcelFile("Organizations", 8, 3);
		String rating = eUtil.getDataFromExcelFile("Organizations", 8, 4);
		String group = eUtil.getDataFromExcelFile("Organizations", 8, 5);
		
		CreatingNewOrganizationPage cnop = new CreatingNewOrganizationPage(driver);
		cnop.CreateNewOrganization(orgName, industry, type,rating, group);
	}

}
