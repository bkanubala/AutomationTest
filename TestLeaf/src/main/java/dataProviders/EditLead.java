package dataProviders;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends Createleadcommoncase {
@Test(dataProvider ="fetchdata", dependsOnMethods = {"wrappers.CreatleadwrappersInherit.Createlead"}, groups={"Smoke"})
		public void Editlead(String Email, String CompName, String FName)
{
		// TODO Auto-generated method stub
				clickByLink("Leads");
				clickByLink("Find Leads");
				clickByXpath("//span[text()='Email']");
				enterByXpath("//input[@name='emailAddress']", Email);
				clickByXpath("//button[text()='Find Leads']");
				clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
				clickByLink("Edit");
				verifyTextById("sectionHeaderTitle_leads","Edit Lead");
				enterById("updateLeadForm_companyName", CompName);
				clickByClassName("smallSubmit");
				verifyTextById("viewLead_firstName_sp", FName);
				
				}
	@DataProvider(name="fetchdata")
	public Object[][] getdata(){
		Object[][] data = new Object[2][3];
				data[0][0] = "bkanubala@gmail.com";
				data[0][1] = "Cognizant12";
				data[0][2] = "Aashu";
				data[1][0] = "demo@gmail.com";
				data[1][1] = "Company456";
				data[1][2] = "Anu";
				return data;
	}
	
}