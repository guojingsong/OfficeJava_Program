package practise_package_2;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseClass {
	public Properties pro;
	public WebDriver dr;
	public Xls_Reader xls;
	public ExtentReports ext=ExtentReporting.getReporting();
	public ExtentTest test;
	
	public BaseClass(){
		init();
		xls = new Xls_Reader("D://Test_Excel.xlsx");
	}
	
	public BaseClass(WebDriver dr,ExtentTest test){
		this.dr=dr;
		this.test=test;
	}
	
	public void init(){
		pro=new Properties();
		try{
			FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\practise_package_2\\OR.properties");
		    pro.load(fis);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public void openBro(String b){
		 if(b.equalsIgnoreCase("chrome")){
		 System.setProperty("webdriver.chrome.driver", "D:\\Software Selenium\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions op =new ChromeOptions();
		 op.addArguments("--disable-notifications");
		 op.addArguments("--start-maximizied");
		 op.addArguments("--disable-infobars");
 		 dr=new ChromeDriver(op);
 		 dr.manage().window().maximize();
 		 dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else{
		  dr=new FirefoxDriver();
		  dr.manage().window().maximize();
	      dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}
	
	public void navigateURL(String url){
		dr.navigate().to(url);
	}
	
	public void screenshot(){
		Date d =new Date();
		String FN=d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try{
			FileHandler.copy(src, new File("D://report//"+FN));
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		test.log(LogStatus.INFO, "Take Screenshot -- > " + test.addScreenCapture("D://report//"+FN));
	}
	
	public WebElement getElement(String loc){
		WebElement w = null;
		if(loc.endsWith("_id"))
			w=dr.findElement(By.id(pro.getProperty(loc)));
		else if(loc.endsWith("_name"))
			w=dr.findElement(By.name(pro.getProperty(loc)));
		else if(loc.endsWith("_xpath"))
			w=dr.findElement(By.xpath(pro.getProperty(loc)));
		else{
			System.out.println("Locater not found");
		}
		return w;
	}
	
	public void inputType(String loctor,String value){
		getElement(loctor).sendKeys(value);
	}
	
	public void inputType_Click(String loctor){
		getElement(loctor).sendKeys(Keys.ENTER);
	}
	
	public void Click_Btn_or_Link(String loctor){
		getElement(loctor).click();
	}
	
	public void wait(int sec){
		try{
			Thread.sleep(sec*1000);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
}
