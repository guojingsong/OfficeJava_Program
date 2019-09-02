package practise_package;

import java.util.Hashtable;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

public class openBrow extends BaseC{
	 public String testcaseName="TCID-02";
	 public String sheetName="Sheet2";

	@Test(dataProvider="getdata")
	public void mainClass(Hashtable<String,String> data){
		test=ext.startTest("Test openBrow Start --- > ");
		openBrowser(data.get("Browser"));
		dr.navigate().to(data.get("URL"));
		screenshot();
		test.log(LogStatus.PASS, "Test Pass");		
	}
	
	@DataProvider
	public Object[][] getdata(){
		return Excel_Test_Data_Read.getSheet_TestData(testcaseName, sheetName, xls);
	}
	
	@AfterTest
	public void test_End(){
		ext.endTest(test);
		ext.flush();
    	quite_Browser(3);
	}

}
