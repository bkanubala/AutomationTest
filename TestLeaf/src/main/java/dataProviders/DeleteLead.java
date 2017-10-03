package dataProviders;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeleteLead extends Createleadcommoncase {
	@Test(groups={"Sanity"}, dataProvider = "fetchdata")
	//@Test(groups={"Sanity"}, dataProvider = "fetchdata", dependsOnGroups={"Smoke"})
	//@Test(dependsOnMethods = {"wrappers.CreatleadwrappersInherit.Createlead"})
	public void Deletelead(String email)
{
		// TODO Auto-generated method stub
				
				clickByLink("Leads");
				clickByLink("Find Leads");
				clickByXpath("//span[text()='Email']");
				enterByXpath("//input[@name='emailAddress']", email);
				clickByXpath("//button[text()='Find Leads']");
				clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
				clickByLink("Delete");
				verifyTextById("sectionHeaderTitle_leads", "My Leads");
				}
@DataProvider(name = "fetchdata")

public Object[][] getdeleteid()
{
	Object[][] data = new Object[2][1];
	data[0][0] = "bkanubala@gmail.com";
	data[1][0] = "demo@gmail.com";
	return data;
}


}