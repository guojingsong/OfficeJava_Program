package sep_Java_Programs;

import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReporting_sep {
	
	public static ExtentReports ext;
	
	public static ExtentReports getReportingbyManoj(){
		if(ext==null){
		Date d=new Date();
		String FileName=d.toString().replace(":", "_").replace(" ", "_")+".html";
		
		ext=new ExtentReports(System.getProperty("user.dir")+"//report//"+FileName);
		ext.addSystemInfo("QA", "Manoj Kushwaha").addSystemInfo("Environment", "10.67.175.45");
	  }
	 return ext;
   }	
}
