package blackpearl;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class deleterows {
	public WebDriver driver;
@Test
	public void delete() throws Throwable
	{
	
	System.setProperty("webdriver.chrome.driver", "/Applications/KinductMaven/blackpearl/chromedriver");
		//System.setProperty("webdriver.chrome.driver", "/usr/local/share/chromedriver");
	driver = new ChromeDriver();
		
	driver.get("https://QA2.kinductdev.com/login");
	 
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath(".//*[@id='username']")).clear();
	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
	
	driver.findElement(By.xpath(".//*[@id='password']")).clear();
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("L3@d3r!");

	
	driver.findElement(By.xpath(".//*[@id='login_form']/div[3]/div/button")).click();
	
	
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
    
	js1.executeScript("javascript:window.scrollBy(250,350)");
	
	driver.findElement(By.xpath(".//*[@id='org_chart']/ul/li/ul/li[52]/a")).click();
	
	driver.findElement(By.xpath(".//*[@id='users']/tbody/tr[1]/td[5]/a[3]/span[1]")).click();
	
	driver.get("https://qa2.kinductdev.com/metrics_management/source_accessibility");
	WaitForElement w = new WaitForElement();
	
	//Search patient
	
	
	
	for(int i =0;i<2300;i++)
	{
		w.isElementHiddenNow(".//*[@id='source_table']/tbody/tr[1]/td[4]/span/span",driver);
	driver.findElement(By.xpath(".//*[@id='source_table']/tbody/tr[1]/td[4]/span/span")).click();
	
	Thread.sleep(1000);
	//w.isElementHiddenNow(".//*[@id='modal-save']",driver);

	driver.findElement(By.xpath(".//*[@id='modal-save']")).click();
	Thread.sleep(1000);
	i=i+1;
	
	}
	
	
	}
}
