package demo;

import org.testng.annotations.Test;

import wrappers.Createleadcommoncase;

public class CreatleadwrappersInherit2 extends Createleadcommoncase {

@Test
public void Createlead()
{
	login();
	clickByLink("Leads");
	clickByLink("Merge Leads");
	clickByXpath("(//img[@alt='Lookup'])[1]");		
	switchToLastWindow();
	enterByXpath("//input[@type='text']","10678");
	clickByXpath("(//button[@type='button'])[1]");
	clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
	switchToParentWindow();
	clickByXpath("(//img[@alt='Lookup'])[2]");
	switchToLastWindow();
	enterByXpath("//input[@type='text'][1]","10679");
	clickByXpath("(//button[@class='x-btn-text'])[1]");
	clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
	switchToParentWindow();
	clickByLinkNoSnap("Merge");
	acceptAlert();
	switchToParentWindow();
	clickByLinkNoSnap("Find Leads");
	enterByXpath("(//input[@type='text'])[29]","10678");
	clickByXpath("(//button[@class= 'x-btn-text'])[7]");
	verifyTextByXpath("//div[text()='No records to display']", "No records to display");
	verifyTextContainsByXpath("//div[text() = 'No records to display']", "No records to display");
	closeBrowser();
		
	}
}