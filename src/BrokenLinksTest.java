import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinksTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert softAssert=new SoftAssert();
		for (WebElement link : links) {// enhanced for loop

			String url = link.getAttribute("href");// get url	
		
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();// to know status code																			// .openConnection() has to call
			// HttpURLConnection here is the return type of .openConnection() method
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			softAssert.assertTrue(respCode<400, "The link with the text:"+" "+link.getText()+": "+"is broken with code"+" "+respCode);
			//softassert is used to continue execution till end it should not'
			//stop in case if broken link gets find out in middle

		}
		softAssert.assertAll();
		// brokel url how do you handle
		// Step:1 is th get all the url's tied up to the links using selenium
		// some java methods will call the urls on page and gets u the status code
		// if status codes>400 then that url is not working means link tied to that url
		// is broken

		// a[h/a[ref *='soapui']
		//with sinfle broken link
		/*
		 * String url =
		 * driver.findElement(By.cssSelector("a[href *='brokenlink']")).getAttribute(
		 * "href");// get url here HttpURLConnection conn = (HttpURLConnection) new
		 * URL(url).openConnection();// to know status code // .openConnection() has to
		 * call // HttpURLConnection here is the return type of .openConnection() method
		 * conn.setRequestMethod("HEAD"); conn.connect(); int respCode =
		 * conn.getResponseCode(); System.out.println(respCode);
		 */

	}

}
