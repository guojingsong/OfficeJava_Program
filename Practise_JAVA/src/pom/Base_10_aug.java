package pom;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Base_10_aug {
     public Properties pro;
     public WebDriver dr;
     public ExtentReports ext=Extent_Aug.getReport_Aug();
     public ExtentTest test;
	 public Xls_Reader xls;
     
     public Base_10_aug(){
		init();
		xls= new Xls_Reader("D://Test_Excel.xlsx");
	 }
	  public void init(){
    	 pro=new Properties();
    	 try{
    		 FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\pom\\OR.properties");
    	     pro.load(fis);
    	 }
    	 catch(Exception e){
    		 System.out.println(e.getMessage());
    	 }
    	 System.out.println("Properties initialized");
     }
	  
	  public void openBro(String bName){
		  if(bName.equalsIgnoreCase("chrome")){
			  System.setProperty("webdriver.chrome.driver", pro.getProperty("Chrome_Browser_exe"));
			  ChromeOptions op=new ChromeOptions();
			  op.addArguments("--start-maximized"); 
			  op.addArguments("--disable-notifications");
			  op.addArguments("--disable-infobars");  //--disable-infobars
			  dr=new ChromeDriver(op);
			  test.log(LogStatus.INFO,"Chrome browser getting opened");
		  }else{
			  System.setProperty("webdriver.gecko.driver", pro.getProperty("Firefox_Browser_exe"));
			  System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "Null");
			  dr=new FirefoxDriver();
			  test.log(LogStatus.INFO,"Firefox browser getting opened");
		  }
	  }
	  
	  public void navigate(String url){
		  dr.navigate().to(url);
	  }
	  
	  public void Click_BTN(String locater){
		  getLocation(locater).click();
	  }
	  
	  
	  public void Click_Link(String locater){
		  getLocation(locater).click();
	  }
	  
	  
	  public void inputText(String locater,String data){
		  getLocation(locater).sendKeys(data);
	  }
	  
	  
	  public void selectValueFormDropDown(String locater,String data){
		  Select selectValue =new Select(getLocation(locater));
		  selectValue.selectByVisibleText(data);
	  }
	  
	  public WebElement getLocation(String loc){
		  WebElement w=null;
		  if(loc.endsWith("_id"))
			  w=dr.findElement(By.id(pro.getProperty(loc)));
		  else if(loc.endsWith("_name"))
			  w=dr.findElement(By.name(pro.getProperty(loc)));
		  else if(loc.endsWith("_xpath"))
			  w=dr.findElement(By.xpath(pro.getProperty(loc)));
		  else{
			  System.out.println("Locater not found on page.");
			  screenshot();
		  }
		  return w;
	  }
	  
	  public void screenshot(){
		  Date d =new Date();
	      String f= d.toString().replace(" ", "_").replace(":", "_")+".jpg";
	      File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
          try{
        	  FileHandler.copy(src,new File("D://report//"+f));
           }catch(Exception ex){
        	   System.out.println(ex.getMessage());
           }
           test.log(LogStatus.INFO,"Screenshot taken successfully --- > " + test.addScreenCapture("D://report//"+f));
	  }
	  
	  public void wait(int s){
		  try{
			  Thread.sleep(s*1000);
		  }catch(Exception e){
			  System.out.println(e.getMessage());
		  }
	  }
	  
	  public void Quite_Browser(int s){
		  try{
			  Thread.sleep(s*1000);
			  dr.quit();
		  }catch(Exception e){
			  System.out.println(e.getMessage());
		  }
	  }
}
