package br.com.tricentis.driver;


import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	static WebDriver driver;

	@BeforeClass
	public static WebDriver getDriver() {

		System.setProperty("webdriver.chrome.driver", "/home/naira/drivers/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		return driver;

	}
	
	@After()
	public void fechar() {
		driver.close();
	}
	
}
