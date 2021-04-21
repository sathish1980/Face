package Pages;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Mavens.Mavensample.Browser;
import Mavens.Mavensample.Excelread;
import Mavens.Mavensample.Propertyfile;
import Mavens.Mavensample.genericmethod;

public class Facebooklogin 
{
	@FindBy(id="email")
	WebElement email_id;
	@FindBy(id="pass")
	WebElement password_element;
	@FindBy(id="loginbutton")
	WebElement login_button;
	genericmethod gm = new genericmethod();
	Propertyfile ps= new Propertyfile();
	String filepath=System.getProperty("user.dir")+"\\inputfile\\";
	String fileName="Facebooklogin.xls";
	String sheetName="login";
	WebDriver driver;
	


/*@Test(priority=1,dataProvider="customerdataread")
public void username(String username, String password)
{
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	//validation
	Boolean female_checkbox=driver.findElement(By.xpath("(//label[text()='Female']//preceding::input)[1]")).isSelected();
	System.out.println("female_checkbox: "+female_checkbox);
	String loginbutton_name=driver.findElement(By.id("loginbutton")).getAttribute("value");
	System.out.println(loginbutton_name);
	driver.findElement(By.id("loginbutton")).click();
	gm.waitforelementbyxpath(driver,By.id("userNavigationLabel"));
	driver.findElement(By.id("userNavigationLabel")).click();
	String MG=driver.findElement(By.className("_54nh")).getText();
	System.out.println(MG);
	gm.waitforelementbyxpath(driver,By.xpath("//span[text()='Log Out']"));
	driver.findElement(By.xpath("//span[text()='Log Out']")).click();
}
*/


public Facebooklogin(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);	
}
public void username(String uname)
{
	//driver.findElement(By.id("email")).sendKeys("kumar.sathish189@gmail.com");
	email_id.sendKeys(uname);
}

public void password(String pword)
{
	//driver.findElement(By.id("pass")).sendKeys("Admin@123");
	password_element.sendKeys(pword);
}

public void loginbutton()
{
	//driver.findElement(By.id("loginbutton")).click();
	login_button.click();
}

public void forgottenaccount()
{
	
}



}
