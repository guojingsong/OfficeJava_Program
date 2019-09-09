package sep_Java_Programs;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class OpenBrowserTest extends Base_Class_sep {
	
	@Test(priority =1)
	public void TestStart_Facebook(){
		openBrowser("chrome");
    	dr.navigate().to(pro.getProperty("appurl"));
    	test.log(LogStatus.INFO, " URL is getting opened successfully... " + pro.getProperty("appurl"));
	}

	@Test(priority =2)
	public void RegisterFacebook(){
    	inputType("username_name", "FirstName");
    	inputType("userlast_name", "LastName");
    	inputType("emailid_xpath", "emailid");
      	inputType("pasword_xpath", "password");
      	Select_by_id("select_day_id", 16);
      	Select_by_visible_Text("select_month_name", pr.getProperty("select_month"));
      	Select_by_visible_Text("select_year_xpath", pr.getProperty("select_year"));
      	wait(3);
      	radioBTNSelection("gender_xpath");
      	screenshot();
      	test.log(LogStatus.PASS, " Application test Passed...  ");
	}
}
