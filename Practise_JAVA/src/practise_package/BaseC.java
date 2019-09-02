package practise_package;

import java.io.File;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseC {
	
	public Xls_Reader xls;
	public WebDriver dr;
	public ExtentReports ext=ExtentReport_M_Class.getReporting_M();
	public ExtentTest test;
	
	public BaseC(){
		xls = new Xls_Reader("D://Test_Excel.xlsx");
	}
	
	public void init(){
		
	}
	
	public void openBrowser(String bName){
          if(bName.equalsIgnoreCase("chrome")){
		   System.setProperty("webdriver.chrome.driver", "D:\\Software Selenium\\chromedriver_win32\\chromedriver.exe");
		   ChromeOptions op=new ChromeOptions();
		   op.addArguments("--start-maximized");
		   op.addArguments("--disable-infobars");
		   op.addArguments("--disable-notifications");
		   dr=new ChromeDriver(op);
          }else{
           System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "Null");
   		   dr=new FirefoxDriver();
          }
	}
	
	public void screenshot(){
		Date d=new Date();
		String FN=d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try{
             FileHandler.copy(src, new File("D://report//"+FN));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		test.log(LogStatus.INFO,"Take screenshot ---> " + test.addScreenCapture("D://report//"+FN));
		
	}

	public void quite_Browser(int s){
		try{
			Thread.sleep(s*1000);
			dr.quit();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
