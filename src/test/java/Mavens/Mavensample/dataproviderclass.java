package Mavens.Mavensample;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class dataproviderclass {
	
	String filepath=System.getProperty("user.dir")+"\\inputfile\\";
	String fileName="Facebooklogin.xls";
	String sheetName="login";
	
	@DataProvider
	public String[][] customerdataread() throws IOException
	{
		return Mavens.Mavensample.Excelread.excelreaddata(filepath, fileName, sheetName);
		
	}

}
