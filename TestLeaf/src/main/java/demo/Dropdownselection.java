package demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownselection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// loading the URL
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		Select dropdown = new Select(driver.findElementByName("dropdown2"));
		dropdown.selectByVisibleText("UFT/QTP");
	}

}
