package wrappers;

import org.junit.Test;

public class EditAccount extends Createleadcommoncase {
	
	@Test
	public void AccountCreate()
{
login();
clickByXpath("(//a[text()='Accounts'])");
clickByXpath("//a[text()='Find Accounts']");
enterByXpath("(//input[@type='text'])[29]","11337");
enterByXpath("(//input[@name='accountName'])[2]","Cognizant20.0");
clickByXpath("(//td[@class='x-btn-center'])[7]");
verifyTextByXpath("(//a[@class='linktext'])[4]","11337");
verifyTextByXpath("(//a[@class='linktext'])[6]","Cognizant20.0");
clickByXpath("(//a[@class='linktext'])[4]");
clickByXpath("//a[text()='Edit']");
enterById("accountName","Cognizant2020");
clickByXpath("(//input[@class='smallSubmit'])[1]");
String accountId = getTextByXpath("(//span[@class='tabletext'])[3]");
verifyTextContainsByXpath("(//span[@class='tabletext'])[3]", "11337");
verifyTextContainsByXpath("(//span[@class='tabletext'])[3]", "Cognizant19");

closeBrowser();

	}

}
