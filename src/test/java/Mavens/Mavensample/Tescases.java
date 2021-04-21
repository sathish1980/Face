package Mavens.Mavensample;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.Facebooklogin;
import Pages.Facebooklogout;

public class Tescases extends Browser
{
	
	@BeforeSuite
	public void launching()
	{
		launch();
	}
	
	@BeforeClass()
	public void urllaunch() throws IOException
	{
		driver.get(ps.getObjectRepository().getProperty("URL"));
	}
	
	@Test(priority=0,dataProvider="customerdataread",dataProviderClass=dataproviderclass.class)
	public void login(String usname,String psword)
	{
		Facebooklogin fc= new Facebooklogin(driver);
		fc.username(usname);
		fc.password(psword);
		fc.loginbutton();
		Facebooklogout fl= new Facebooklogout();
		fl.logoutdropdown();
		fl.logout();
		
	}
	
	
	@AfterSuite()
	public void teardown()
	{
		end();
	}
	
	
}
