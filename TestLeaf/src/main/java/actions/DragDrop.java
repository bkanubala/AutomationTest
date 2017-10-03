package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Sortable").click();
		WebElement demo = driver.findElementByClassName("demo-frame");
		 driver.switchTo().frame(demo);
		Actions builder = new Actions(driver);
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
		int y = item5.getLocation().getY();
		builder.dragAndDropBy(item1, 0, y).build().perform();
		
		}

}
