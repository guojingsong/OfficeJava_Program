package sep_Java_Programs;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class Proper {
	public Properties pro;
	public Proper(){
			pro=new Properties();
			try{
				FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\sep_Java_Programs\\OR.properties");
				pro.load(fis);
			}catch(Exception ex){
				System.out.println(ex.getMessage());
			}
		}

	@Test
	public void test() {
		System.out.println(System.getProperty("user.dir")+"\\src\\sep_Java_Programs\\OR.properties");
		System.out.println(pro.getProperty("appurl"));
		//System.out.println(pro.getProperty("Chrome_Browser_logPath"));
	}

}
