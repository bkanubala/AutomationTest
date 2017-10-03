package wrappers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Creatleadwrappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				GenericWrappers gw = new GenericWrappers();
				gw.invokeApp("Chrome", "http://leaftaps.com/opentaps");
				gw.enterById("username", "DemoSalesManager");
				gw.enterById("password", "crmsfa");
				gw.clickByClassName("decorativeSubmit");
				gw.clickByLink("CRM/SFA");
				gw.clickByLink("Create Lead");
				gw.enterById("createLeadForm_companyName", "CTS");
				gw.enterById("createLeadForm_firstName", "Shamili");
				gw.enterById("createLeadForm_lastName", "Rajesh");
				gw.clickByClassName("smallSubmit");
				

			
				
		
		
		
	}
}