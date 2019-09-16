package sep_Java_Programs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Bootstrap_dropdown extends Base_Class_sep{
	
	@Test
	public void bootstrap(){
		openBrowser("chrome");
		//navigateURL("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		navigateURL("https://seleniumautomationpractice.blogspot.com/");
		wait(1);	
		
		System.out.println(dr.getTitle());
		dr.findElement(By.name("firstname")).sendKeys("Manoj Kushwaha");
		
		
		
		/*clickBTN_Link("MainMenu_id");
		
		List<WebElement> list_Element = dr.findElements(By.xpath("//ul[@class='dropdown-menu']"));
		for(int i=0;i<list_Element.size();i++){
		  String Link_Name=	list_Element.get(i).getText();
		  System.out.println(Link_Name);
		}
		screenshot();
		//Now click on JavaScript link.
		WebElement javaScript = dr.findElement(By.xpath("//a[text()='JavaScript']"));
		if(javaScript.isDisplayed()){
			javaScript.click();
		}else{
			Reporter.log("Link is not available on web page.");
		}*/
		wait(2);
		screenshot();
	}

}
