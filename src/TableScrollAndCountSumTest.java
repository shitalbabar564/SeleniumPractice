import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableScrollAndCountSumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,675)");
		//Thread.sleep(3000);
		List<WebElement> values=driver.findElements(By.cssSelector(".left-align td:nth-child(3)"));
		int sum=0;
		for(int i=0;i<values.size();i++) {
			sum=sum + Integer.parseInt(values.get(i).getText());
			
		}
		System.out.println("Sum="+sum);
		//on my own i have coded this and succefully done

	}

}
