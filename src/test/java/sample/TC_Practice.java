package sample;

import org.testng.annotations.Test;

import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import genericUtility.BaseClass;
import genericUtility.Excelutility;

public class TC_Practice extends BaseClass{

@Test
public void testCase() throws Exception
{
	Excelutility eUtil = new Excelutility();
	
	String fName = eUtil.getDataFromExcelFile("Leads", 2, 1);
	String lName = eUtil.getDataFromExcelFile("Leads", 2, 2);
	String company = eUtil.getDataFromExcelFile("Leads", 2, 3);
	
	HomePage hp = new HomePage(driver);
	hp.clickOnLeadMenu();
	
	LeadsPage lp = new LeadsPage(driver);
	lp.clickOnCreateNewLeadIcon();
	
	CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
	cnlp.createNewLead(fName, lName, company);
	
}

}
