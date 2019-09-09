package sep_Java_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick_Test extends Base_Class_sep{
   @Test
   public void test(){
	   openBrowser("chrome");
	   dr.navigate().to(pro.getProperty("appurl_1"));
	   inputType("textbox_name", "textbox");

/*       Actions act=new Actions(dr);
       WebElement ele = getEelemet("double_Click_id");
       act.doubleClick(ele).build().perform();
       
       System.out.println(dr.switchTo().alert().getText());
       dr.switchTo().alert().accept();
	   wait(1);
	   screenshot();	   */
	   inputType("click_check_Box_xpath");
	   
	   Actions ac=new Actions(dr);
	   WebElement source = getEelemet("source_image_id");
	   WebElement destination = getEelemet("destination_id");
	   wait(1);
	  // ac.dragAndDrop(source, destination).build().perform();
	   ac.dragAndDrop(source, destination).perform();
	   wait(1);
	   screenshot();
	   
   }
}
