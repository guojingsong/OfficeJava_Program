package sep_Java_Programs;

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
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base_Class_sep {
	Properties pro;
	Properties pr;
	WebDriver dr;

	public Base_Class_sep(){
		init_config();
	}
	
	public void init_config(){
		pr=new Properties();
		try{
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\sep_Java_Programs\\config.properties");
		    pr.load(fis);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}	
	}

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
	
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", pro.getProperty("Chrome_Browser_exe"));
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--start-maximized");
		op.addArguments("--disable-notifications");
		op.addArguments("--disable-infobars");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
	}
	
	public WebElement getEelemet(String loc){
		WebElement w=null;
        if(loc.endsWith("_id"))
        	w=dr.findElement(By.id(pro.getProperty(loc)));
        else if(loc.endsWith("_name"))
        	w=dr.findElement(By.name(pro.getProperty(loc)));
        else if(loc.endsWith("_xpath"))
        	w=dr.findElement(By.xpath(pro.getProperty(loc)));
        else{
        	screenshot();
        	Reporter.log("Element Not found by driver", true);
        }
        return w;
	}
	
	public void inputType(String locator,String data){
		getEelemet(locator).sendKeys(pr.getProperty(data));
	}
	
	public void clickBTN_Link(String locator){
		getEelemet(locator).click();
	}
	
	public void Select_by_id(String loctor, int date){
		Select value_by_id=new Select(getEelemet(loctor));
		value_by_id.selectByIndex(date);
	}
	
	public void Select_by_visible_Text(String loctor, String month){
		Select value_by_visibletext=new Select(getEelemet(loctor));
		value_by_visibletext.selectByVisibleText(month);
	}
	
	public void Select_by_visiblevalue(String loctor, String year){
		Select value_by_visible_data=new Select(getEelemet(loctor));
		value_by_visible_data.selectByValue(year);
	}
	
	public void radioBTNSelection(WebElement ele){
       if(!ele.isSelected()){
    	   ele.click();
       }else{
    	   Reporter.log("Radio_button_already_selected",true);
       }
	}
	
	public void radioBTNSelection(String loctor){
		getEelemet(loctor).click();
		Reporter.log("Radio_button_selected_Successfully",true);
	}
	
	public void screenshot(){
		Date d=new Date();
		String FN=d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try{
			FileHandler.copy(src, new File(System.getProperty("user.dir")+"//report//"+FN));
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
	public void wait(int sec){
	try{
		Thread.sleep(sec*1000);
        Reporter.log("Now wait execution till " + sec + "second", true);
	}catch(Exception ex){
		System.out.println(ex.getMessage());
	}
  }
	
	@AfterClass
	public void quitBrowser(){
		quit_all_Browser_instance(5);
	}
	
	public void quit_all_Browser_instance(int sec){
	try{
		Thread.sleep(sec*1000);
        Reporter.log("Now going to close all browser after " + sec + "second", true);
		dr.quit();
	}catch(Exception ex){
		System.out.println(ex.getMessage());
	}
  }
	
	
}
