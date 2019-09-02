package pom;

import java.util.Hashtable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MainClass extends Base_10_aug{
	String sheetName="Sheet2";
	String testcase = "TCID-02";
    @Test(dataProvider="getdata")
	public void myAug(Hashtable<String,String> data){
    	test =ext.startTest("Test Start");
    	openBro(data.get("Browser"));
    	navigate(data.get("URL"));
    	screenshot();
    }
    
    @AfterMethod
    public void tearDown(){
    	ext.endTest(test);
    	ext.flush();
    	Quite_Browser(5);
    }
    
    @DataProvider
    public Object[][] getdata(){
    	return ExcelFile_Reading.getExcelData_Aug(xls, sheetName, testcase);
    }
}
