package practise_package;

import java.io.File;
import java.util.Hashtable;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class OpenBrowser_Excel {
	public String sheetName="Sheet2";
	public String testCaseName="TCID-02";
	public WebDriver dr;
	public ExtentReports ext = ExtentReportByAug.getReportByAug();
	public ExtentTest test;
  @Test(dataProvider="getData")
  public void getOpenBro(Hashtable<String,String> DATA){
	  test= ext.startTest("Test");
	  test.log(LogStatus.INFO, "Test Start");
	  System.setProperty("webdriver.chrome.driver", "D:\\Software Selenium\\chromedriver_win32\\chromedriver.exe");
	   ChromeOptions op=new ChromeOptions();
	   op.addArguments("--start-maximized");
	   op.addArguments("--disable-infobars");
	   op.addArguments("--disable-notifications");
	   dr=new ChromeDriver(op);
	   dr.navigate().to(DATA.get("URL"));
	   
	   File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	   try{
		   FileHandler.copy(src, new File("D://report//ABC.jpg"));
	   }catch(Exception ex){
		   System.out.println(ex.getMessage());
	   }
	   test.log(LogStatus.INFO, "Take Screenshot -- > " + test.addScreenCapture("D://report//ABC.jpg"));
  }
  
  @AfterTest
  public void tearDown(){
	  ext.endTest(test);
	  ext.flush();
	  dr.quit();
  }
  
  @DataProvider
  public Object[][] getData(){
	  return DuplicateArray_value.getExcelData_test(sheetName, testCaseName);
  }
}
