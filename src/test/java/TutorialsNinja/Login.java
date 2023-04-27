package TutorialsNinja;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Login extends BaseClass{
	
	WebDriver driver = new ChromeDriver() ;	
	public SoftAssert softAssert = new SoftAssert();
	
	
	@BeforeMethod
	public void Tutorials() {
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));    
	driver.get("https://tutorialsninja.com/demo/");
	driver.findElement(By.xpath("//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	}
	
   @Test (priority = 1)
    public void TutorialsLogin(){	
    driver.findElement(By.id("input-email")).sendKeys("faragsally7@gmoal.com");
    driver.findElement(By.id("input-password")).sendKeys("10399Mark");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    driver.findElement(By.xpath("//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();	
	driver.findElement(By.xpath("//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[5]/a[1]")).click();
    
   }

   @Test (priority = 2)
   public void InvalidLogin () throws IOException {
	
        driver.findElement(By.id("input-email")).sendKeys("faragsally7@gmoal.com");
        driver.findElement(By.id("input-password")).sendKeys("10399Mar");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        TakesScreenshot ts = ((TakesScreenshot)driver);
    	File scr=ts.getScreenshotAs(OutputType.FILE);
    	File trg=new File("./Screenshot1/Image1.png");
        String msglogout = driver.findElement(By.xpath("//body/div[@id='account-login']/div[1]")).getText();
		softAssert.assertEquals(msglogout.contains("No match"), true);
	
 }
 @AfterTest
 public void quit() {
	
driver.close();
 }
	
}
     	 