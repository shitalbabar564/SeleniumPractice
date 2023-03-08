import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
	
		driver.findElement(By.cssSelector("input[id='form-field-travel_comp_date']")).click();

		// provide random month name and date and test should pass

		//driver.findElement(By.id("form-field-travel_comp_date")).click();
	
		//JavascriptExecutor js = (JavascriptExecutor) driver;

		// Call the JavascriptExecutor methods
		//js.executeScript("driver.findElement(By.id(\"form-field-travel_comp_date\")).click());"
		System.out.println("hi.............");
		/*
		 * List<WebElement> dates = driver.findElements(By.className("flatpickr-day "));
		 * int count = driver.findElements(By.className("flatpickr-day ")).size(); for
		 * (int i = 0; i < count; i++) { String text =
		 * driver.findElements(By.className("flatpickr-day ")).get(i).getText(); if
		 * (text.equalsIgnoreCase("23"))
		 * driver.findElements(By.className("flatpickr-day ")).get(i).click();
		 * 
		 * }
		 */

	}

}
