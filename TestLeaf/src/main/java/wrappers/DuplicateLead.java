package wrappers;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DuplicateLead extends Createleadcommoncase {
	@Test(groups={"Regression"},dependsOnGroups = {"Smoke"}, dataProvider = "fetchdata")
//@Test(enabled = false)
	public void Duplicatelead(String eMail, String name)
{
				clickByLink("Leads");
				clickByLink("Find Leads");
				getTextById("sectionHeaderTitle_leads");
				getTextByXpath("//div[@id='sectionHeaderTitle_leads']");
				clickByXpath("//span[text()='Email']");
				enterByXpath("//input[@name='emailAddress']", eMail);
				clickByXpath("//button[text()='Find Leads']");
				clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
				clickByLink("Duplicate Lead");
				verifyTextById("sectionHeaderTitle_leads","Duplicate Lead");
				clickByClassName("smallSubmit");
				verifyTextById("viewLead_firstName_sp", name);
				}
	
	@DataProvider(name="fetchdata")
	public Object[][] getDuplicatedata()
	{
		Object[][] data = new  Object[2][4];
		data[0][1] = "bkanubala@gmail.com";
		data[0][2] = "Aashu";
		data[1][1] = "demo@gmail.com";
		data[0][2] = "Anu";
		return data;
	}
}