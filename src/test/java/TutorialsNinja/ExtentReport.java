package TutorialsNinja;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ExtentReport extends BaseClass {
	
	  ExtentReports extent = new ExtentReports();
	  ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
	 
	  
  @Test
  public void f() {
	  ExtentTest test = extent.createTest("Launch the browsrer");
	  test.log(Status.PASS,"USER LAUNCHED");
	  test.pass("USER LAUNCHED");
  }
  


	
	  
  }


