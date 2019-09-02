package practise_package;

import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReportByAug {
	
	public static ExtentReports ext;
	public static ExtentReports getReportByAug(){
		if(ext==null){
		Date d=new Date();
		String FN=d.toString().replace(" " , "_").replace(":", "_")+".html";
		ext=new ExtentReports("D://report//"+FN,true,DisplayOrder.NEWEST_FIRST);
		ext.addSystemInfo("QA", "Manoj");
	}
		return ext;
	}
}
