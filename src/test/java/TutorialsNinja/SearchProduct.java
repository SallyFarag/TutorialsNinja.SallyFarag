package TutorialsNinja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchProduct extends BaseClass {

	
	WebDriver driver = new ChromeDriver() ;

	
	@Test 
	public void TutoriaSearchProduct() {
		 	
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");

    driver.findElement(By.xpath("//body/div[1]/nav[1]/div[2]/ul[1]/li[7]/a")).click();
    driver.findElement(By.linkText("Nikon D300")).click();
    driver.findElement(By.id("button-cart")).click();
	}
	
   
	 @Test(dependsOnMethods = "TutoriaSearchProduct")
	    public void TutorialsUnit() {
	    System.out.println("Search for Camera");
	 }
	 
	}

