package actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Actions builder = new Actions(driver);
		WebElement fashion = driver.findElementById("nav-link-shopall");
		builder.moveToElement(fashion);
		WebElement WFashion = driver.findElementByXPath("(//span[@class='nav-text'])[11]");
		builder.moveToElement(WFashion)
		.pause(Duration.ofSeconds(3)).click(WFashion)
		.build().perform();
		
		
		}

}
