import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locator02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name="shital";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//why this implicit wait method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String passWord=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(passWord);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		/*
		 * System.out.println(driver.findElement(By.tagName("p")).getText());
		 * Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),
		 * "You are successfully logged in.");
		 */
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
	}
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		//String to split is:Please use temporary password 'rahulshettyacademy' to Login.
		String PasswordText=driver.findElement(By.cssSelector("form p")).getText();
		String[] passWordArray=PasswordText.split("'");
		/*
		 * String[] passWordArray2=passWordArray[1].split("'");
		 *  passWordArray2[0];
		 */
		//0th index:Please use temporary password 
		//1st index:rahulshettyacademy' to Login.
		
		//0th index:rahulshettyacademy
		//1st index: to Login.
		String actualPassword=passWordArray[1].split("'")[0];
		return actualPassword;
		
	}

}
