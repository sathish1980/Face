package Mavens.Mavensample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class genericmethod {

	public void waitforelementbyxpath(WebDriver driver,By value)
	{
		WebDriverWait wd= new WebDriverWait(driver,60);
		wd.until(ExpectedConditions.elementToBeClickable(value));
	}
}
