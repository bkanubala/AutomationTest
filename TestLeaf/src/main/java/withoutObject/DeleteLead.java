package withoutObject;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sun.webkit.WebPage;

public class DeleteLead extends Createleadcommoncase {
	@Test(groups={"Sanity"})
	//@Test(dependsOnMethods = {"wrappers.CreatleadwrappersInherit.Createlead"})
	public void Deletelead()
{
		// TODO Auto-generated method stub
				
				clickByLink("Leads");
				clickByLink("Find Leads");
				clickByXpath("//span[text()='Email']");
				enterByXpath("//input[@name='emailAddress']", "bkanubala@gmail.com");
				clickByXpath("//button[text()='Find Leads']");
				clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
				clickByLink("Delete");
				verifyTextById("sectionHeaderTitle_leads", "My Leads");
				}
}