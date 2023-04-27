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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Registration extends BaseClass{
	
	WebDriver driver = new ChromeDriver();
	public SoftAssert softAssert = new SoftAssert();
	
	
	@BeforeTest
	
	public void LaunchURL() throws IOException {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
	    driver.findElement(By.xpath("//li[@class='dropdown']/a/i")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
     	}
	
		@Test 
		public void regtster() throws IOException  {
	
		driver.findElement(By.id("input-firstname")).sendKeys("Sally");
		driver.findElement(By.id("input-lastname")).sendKeys("Farag");
		driver.findElement(By.id("input-email")).sendKeys("faragsally7@gmol.com");
		driver.findElement(By.id("input-telephone")).sendKeys("7037897961");
		driver.findElement(By.id("input-password")).sendKeys("password");
		driver.findElement(By.id("input-confirm")).sendKeys("10399Mark");
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).click();
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File scr=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/Image1.png");
		FileUtils.copyFile(scr, trg);
		
	      String msglogout = driver.findElement(By.xpath("//body/div[@id='account-register']")).getText();
		  softAssert.assertEquals(msglogout.contains(" already"), true);
		}
		  @AfterTest
		  public void logout() {
			  driver.close();
			  
		  }
		 
	}
	
	
		


