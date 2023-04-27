package TutorialsNinja;

import org.apache.log4j.PropertyConfigurator;
import org.mortbay.log.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	ReadConfig readconfig = new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	public String UserName= readconfig.getusername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	
	public static Logger Logger;
	

	    public void setup() {
	    	System.getProperty("webdriver.chrome.driver",readconfig.getChromePath());
	    	driver = new ChromeDriver();
	        Logger=Logger.getLogger("Login");
			PropertyConfigurator.configure("log4j.Properties");
		
	    }
	
@AfterClass
public void tearDown() {
driver.quit();

}

}