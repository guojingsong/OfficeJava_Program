package pom;

import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class Extent_Aug {
       
	public static ExtentReports ext;
	public static ExtentReports getReport_Aug(){
    	  if(ext==null){
    		  Date d=new Date();
    		  String F=d.toString().replace(" ", "_").replace(":", "_")+".html";
    		  ext=new ExtentReports("D://report//"+F,true,DisplayOrder.NEWEST_FIRST);
    		  ext.addSystemInfo("QA", "Manoj Kushwaha");
    	  }
    	  return ext;
    }
}
