package dataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreatleadwrappersInherit extends Createleadcommoncase {
		@Test(dataProvider = "fetchdata", dataProviderClass =dataProviders.DataProviders.class)
	public void Createlead(String CompanyName, String Fname, String Lname) throws Exception
		{
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", CompanyName);
		enterById("createLeadForm_firstName", Fname);
		enterById("createLeadForm_lastName", Lname);
		clickByClassName("smallSubmit");
		}
}