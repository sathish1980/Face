package Pages;

import org.openqa.selenium.By;

import Mavens.Mavensample.Browser;
import Mavens.Mavensample.genericmethod;

public class Facebooklogout extends Browser
{	genericmethod gm = new genericmethod();

	public void logoutdropdown()
	{
		gm.waitforelementbyxpath(driver,By.id("userNavigationLabel"));
		driver.findElement(By.id("userNavigationLabel")).click();
		
	}
	
	public void logout()
	{
		gm.waitforelementbyxpath(driver,By.xpath("//span[text()='Log Out']"));
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();

	}
}
