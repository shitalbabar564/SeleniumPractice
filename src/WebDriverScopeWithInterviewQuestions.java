import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverScopeWithInterviewQuestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// 1.count of links in the webpage
		// HCL interview question to find no of links in the webpage
		System.out.println(driver.findElements(By.tagName("a")).size());
		// 2.count of links only on specific aea on the page like only on the footer
		// section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));// subsection of the main driver or limiting web
																		// driver scope
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		// 3.get the links on the footer: 1st coloumn links only only,here there are 4
		// coloumns
		WebElement coloumnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumnDriver.findElements(By.tagName("a")).size());
		// 4.click on each link and check if the pages are opening or not and also get
		// title of those pages
		for (int i = 1; i < coloumnDriver.findElements(By.tagName("a")).size(); i++) {
			String clickonlink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			coloumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(5000L);
		} // opens all the tab this for loop
		Set<String> abc = driver.getWindowHandles();// count will be 4 in abc
		Iterator<String> it = abc.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}
}
//tell this 4th scenario as your best worki in current organization