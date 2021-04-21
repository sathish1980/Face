package Mavens.Mavensample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Mavens.Mavensample.Propertyfile;

public class Browser {

	public static WebDriver driver;
	Propertyfile ps= new Propertyfile();
	String chromediverpath="C:\\Users\\sathish.kumar15\\Desktop\\SathishkumarR\\Personal\\EY\\selenium\\chromedriver_win32\\chromedriver.exe";
	
	
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver",chromediverpath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		//driver=new HtmlUnitDriver();
		driver=new ChromeDriver(options);
		//driver =new ChromeDriver(options);
		//driver.manage().window().maximize();

	}
	
	public void end()
	{
		driver.close();
		driver.quit();
	}
}
