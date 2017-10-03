package withoutObject;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends Createleadcommoncase {
	@Test(groups={"Sanity"})
//@Test(dependsOnMethods = {"wrappers.CreatleadwrappersInherit.Createlead"})
		public void Editlead()
{
		// TODO Auto-generated method stub
				clickByLink("Leads");
				clickByLink("Find Leads");
				clickByXpath("//span[text()='Email']");
				enterByXpath("//input[@name='emailAddress']", "bkanubala@gmail.com");
				clickByXpath("//button[text()='Find Leads']");
				clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
				clickByLink("Edit");
				verifyTextById("sectionHeaderTitle_leads","Edit Lead");
				enterById("updateLeadForm_companyName", "Cognizant");
				clickByClassName("smallSubmit");
				verifyTextById("viewLead_firstName_sp", "Aashu");
				
	
	}
	
}