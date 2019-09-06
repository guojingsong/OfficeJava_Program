package sep_Java_Programs;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenBrowserTest {
	Properties pro;
	WebDriver dr;

	@BeforeClass
	public void init(){
		pro=new Properties();
		try{
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\sep_Java_Programs\\OR.properties");
		    pro.load(fis);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
	@Test(priority =1)
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", pro.getProperty("Chrome_Browser_exe"));
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--start-maximized");
		op.addArguments("--disable-notifications");
		op.addArguments("--disable-infobars");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
	}
	
	@Test(priority =2)
	public void navigateURL(){
    	dr.navigate().to(pro.getProperty("appurl"));
	}
	
	@AfterClass
	public void quitBrowser(){
		quit_all_Browser_instance(5);
	}
	
	public void quit_all_Browser_instance(int sec){
	try{
		Thread.sleep(sec*1000);
        Reporter.log("Now going to close all browser after " + sec + "second");
		dr.quit();
	}catch(Exception ex){
		System.out.println(ex.getMessage());
	}
  }
}
