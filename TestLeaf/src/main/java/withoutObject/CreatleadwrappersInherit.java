package withoutObject;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreatleadwrappersInherit extends Createleadcommoncase {
@Test(invocationCount = 1, invocationTimeOut= 120000, groups={"Smoke"})
public void Createlead() throws InterruptedException
	//public void Createlead()
{
		// TODO Auto-generated method stub
				/*invokeApp("Chrome", "http://leaftaps.com/opentaps");
				enterById("username", "DemoSalesManager");
				enterById("password", "crmsfa");
				clickByClassName("decorativeSubmit");
				clickByLink("CRM/SFA");*/
				clickByLink("Create Lead");
				enterById("createLeadForm_companyName", "CompanyName");
				enterById("createLeadForm_firstName", "Fname");
				enterById("createLeadForm_lastName", "Lname");
				Thread.sleep(2500);
				clickByClassName("smallSubmit");
				/*enterById("createLeadForm_firstNameLocal","Anu1");
				enterById("createLeadForm_lastNameLocal","Aashnee");
				enterById("createLeadForm_personalTitle","Mrs");
				selectVisibileTextById("createLeadForm_dataSourceId", "Employee");
				enterById("createLeadForm_generalProfTitle", "TEST LEAD");
				enterById("createLeadForm_annualRevenue", "3000000");
				selectVisibileTextById("createLeadForm_industryEnumId", "Finance");
				selectVisibileTextById("createLeadForm_ownershipEnumId", "Public Corporation");
				enterById("createLeadForm_sicCode", "ABBCDE");
				enterById("createLeadForm_description", "Automating the Test lead WebPage and entering the values for Create leads");
				enterById("createLeadForm_importantNote", "Important Note: Please make a note of the Leads name");
				enterById("createLeadForm_primaryPhoneCountryCode","3");
				enterById("createLeadForm_primaryPhoneAreaCode", "600004");
				enterById("createLeadForm_primaryPhoneExtension", "044");
				enterById("createLeadForm_departmentName","Information and Technology Services");
				selectVisibileTextById("createLeadForm_currencyUomId", "ARS - Argentina Peso");
				enterById("createLeadForm_numberEmployees", "5");
				enterById("createLeadForm_tickerSymbol", "+");
				enterById("createLeadForm_primaryPhoneAskForName","Paul Saranya");
				enterById("createLeadForm_primaryWebUrl", "wwww.google.com");
				enterById("createLeadForm_generalToName", "Revathi");
				enterById("createLeadForm_generalAddress1", "No. 93/53 P.S Sivasaami Saalai");
				enterById("createLeadForm_generalAddress2", "Mylapore");
				enterById("createLeadForm_generalCity", "Chennai");
				selectVisibileTextById("createLeadForm_generalCountryGeoId", "United States");
				selectVisibileTextById("createLeadForm_generalStateProvinceGeoId", "California");
				enterById("createLeadForm_generalPostalCode", "600004");
				enterById("createLeadForm_generalPostalCodeExt", "044");
				selectVisibileTextById("createLeadForm_marketingCampaignId", "eCommerce Site Internal Campaign");
				enterById("createLeadForm_primaryPhoneNumber","9884562153");
				enterById("createLeadForm_primaryEmail","bkanubala@gmail.com");
				clickByClassName("smallSubmit");
				verifyTextById("viewLead_firstName_sp", "Anu");
				*/
		
	}
}