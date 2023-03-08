package io.shital;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemoonStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// algorithm or scenario 1
		// ==============================================================

		// 1 click on coloumn
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// 2 capture all the values into list
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));

		// 3 capture text of all webelement into a new list(Origional list)
		List<String> origionalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());

		// 4 sort in the list of step 3-> sorted list
		List<String> sortedList = origionalList.stream().sorted().collect(Collectors.toList());

		Assert.assertTrue(origionalList.equals(sortedList));
		// 5 compare origional list vs sorted list

		// scenario 2
		// =======================================================================
		// scan the name coloumn with gettext -> Beans print the price of the it
		List<String> price = elementsList.stream().filter(s -> s.getText().contains("Beans")).map(s -> getVegiePrice(s))
				.collect(Collectors.toList());
		price.forEach(a -> System.out.println("Price of the item Beans:" + a + "RS"));

		// scenario 3
		// what if requested price not present in first page
		// in that case we required pagination lets bring it in this scenario
		List<String> price1;
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			price1 = rows.stream().filter(s -> s.getText().contains("Rice"))
					.map(s -> getVegiePrice(s)).collect(Collectors.toList());
			price1.forEach(a -> System.out.println("Price of the item Rice:" + a + "RS"));
			if (price1.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();

			}
		} while (price1.size() < 1);	

	}

	private static String getVegiePrice(WebElement s) {
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
