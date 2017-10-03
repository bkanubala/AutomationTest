package programs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkboxselection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// loading the URL
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		WebElement checkbox = driver.findElementByXPath("//input[@type='checkbox'][3]");
		checkbox.click();
		
		if(checkbox.isSelected()){
			System.out.println("Check box is enabled");
		}
		else
		{
			System.out.println("Check box is disabled");
		}
		}
	}

