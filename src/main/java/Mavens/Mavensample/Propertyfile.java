package Mavens.Mavensample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile {

	public Properties p = new Properties();
    public Properties getObjectRepository() throws IOException{
        //Read object repository file
    	FileInputStream stream = new FileInputStream(new File(System.getProperty("user.dir")+"\\PropertyFile\\Generalproperties.properties"));
        //load all objects
        p.load(stream);
        return p;
    }

}
