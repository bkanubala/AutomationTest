package withoutObject;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DuplicateLead extends Createleadcommoncase {
	@Test(groups={"Regression"},dependsOnGroups = {"Smoke"})
//@Test(enabled = false)
	public void Duplicatelead()
{
				clickByLink("Leads");
				clickByLink("Find Leads");
				getTextById("sectionHeaderTitle_leads");
				getTextByXpath("//div[@id='sectionHeaderTitle_leads']");
				clickByXpath("//span[text()='Email']");
				enterByXpath("//input[@name='emailAddress']", "bkanubala@gmail.com");
				clickByXpath("//button[text()='Find Leads']");
				clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
				clickByLink("Duplicate Lead");
				verifyTextById("sectionHeaderTitle_leads","Duplicate Lead");
				clickByClassName("smallSubmit");
				verifyTextById("viewLead_firstName_sp", "Aashu");
				}
}