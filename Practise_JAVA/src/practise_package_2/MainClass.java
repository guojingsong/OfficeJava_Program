package practise_package_2;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MainClass extends BaseClass{
	String sheetName="Sheet2";
	String testCasesName="TCID-02";
	@Test(dataProvider="getData")
	public void callingMethod(Hashtable<String,String> data) throws Exception {
		test=ext.startTest("callingMethod........");
		openBro(pro.getProperty("Browser"));
		navigateURL(data.get("URL"));
		screenshot();
		dr.switchTo().frame(0);
		inputType("Email_ID_name", data.get("userID"));
		inputType("Email_password_id", data.get("Password"));
		Click_Btn_or_Link("SignIN_btn_xpath");
		wait(2);
		screenshot();
    }
	
	@AfterTest
	public void tearDown(){
		ext.endTest(test);
		ext.flush();
		wait(7);
		dr.quit();
	}
	
	@DataProvider
	public Object[][] getData(){
		return ExcelReaderClass.getExcelData(xls, sheetName, testCasesName);
	}

}
