package practise_package;

import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReport_M_Class {
	
	public static ExtentReports ext;
	public static ExtentReports getReporting_M(){
		if(ext==null){
			Date d=new Date();
			String FN=d.toString().replace(" ", "_").replace(":", "_")+".html";
			ext=new ExtentReports("D://report//"+FN,true,DisplayOrder.NEWEST_FIRST);
			ext.addSystemInfo("QA","Manoj Kushwaha");
			ext.addSystemInfo("Test Environment", "10.67.175.30");
		}
		return ext;
	}

}
