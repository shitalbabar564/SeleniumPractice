import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		Proxy p=new Proxy();//for proxy settings
		p.setHttpProxy("ipaddess:4444");
		options.setCapability("proxy", p);
		Map<String,Object> m=new HashMap<String, Object>();
		m.put("download defalult directory", "/directory path");
		options.setExperimentalOption("map", m);
		
		//FirefoxOptions op=new FirefoxOptions(); //also available
		//EdgeOptions
		//saEdgeOptions
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle()); 

	}

}
