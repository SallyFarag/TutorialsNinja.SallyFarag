package TutorialsNinja;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
    Properties pro;
    
    public ReadConfig() {
    
    File src = new File("./configuration/configProp");
    
    try {
    
    FileInputStream fis= new FileInputStream (src);
    pro =new Properties();
    pro.load(fis);
    }catch (Exception e) {
 
    	System.out.println("Exception is"+ e.getMessage());
    }}
    	public String getApplicationURL() {
    String URL= pro.getProperty("baseURL");
    return URL;
    
    }
    	
      	public String getusername() {
      	    String URL= pro.getProperty("UserName");
      	    return URL;
}
      	public String getPassword() {
      	    String URL= pro.getProperty("password");
      	    return URL;
}
      	
    	public String getChromePath() {
      	    String URL= pro.getProperty("ChromPath");
      	    return URL;
}
}
	
		
   


