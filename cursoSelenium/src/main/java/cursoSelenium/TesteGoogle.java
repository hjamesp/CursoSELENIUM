package cursoSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
	
	@Test
	public void teste() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bruno\\drivers\\FirefoxDriver\\geckodriver.exe");	    
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com.br");
		Assert.assertEquals("Google", driver.getTitle());
		System.out.println(driver.getTitle());
		
	  }

}
