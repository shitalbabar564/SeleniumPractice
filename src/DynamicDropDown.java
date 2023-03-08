import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// xpath for bangluru: //a[@value='BLR'] from
		// xpath for chennai: //a[@value='MAA'] to

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);//not a good practice to handle synchronization
		//Exception in thread "main" org.openqa.selenium.ElementNotInteractableException: element not interactable you will get this by below line
		//but to solve this you should give index no
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); 
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		////div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']
		//similar to line no 20 or we can say instead of indexing we can use this syntax as well
		System.out.println("hiiiiiiii");
		//selects calender current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	}  
}
