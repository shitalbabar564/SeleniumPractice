import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		
		//Invoking the browser
		//Firefox FireFoxDriver-> Methods close()
		//Chrome- ChromeDriver-> Methods close()
		//chromedriver.exe will invokes chrome browser
		//webdriver.chrome.driver value of a path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://w3schools.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		

	}

}
