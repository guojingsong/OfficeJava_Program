package sep_Java_Programs;

import java.util.Hashtable;
import org.testng.annotations.Test;
public class ExcelReader_Util {
	
	public static Object[][] excel_Reader_Method(Xls_Reader xls, String testcasesName, String sheetName ){
		int startTestRow = 1;
		while(!xls.getCellData(sheetName, 0, startTestRow).equals(testcasesName)){
			startTestRow++;
		}
		System.out.println("Test Start Row --- > " + startTestRow );
		int ColStartNO=startTestRow+1;
		int RowStartNo=startTestRow+2;
  
		int row=0;
		while(!xls.getCellData(sheetName, 0, RowStartNo+row).equals("")){
			row++;
		}
		System.out.println(" Start ROW  " + RowStartNo);
		
		int col=0;
		while(!xls.getCellData(sheetName, col, ColStartNO).equals("")){
			col++;
		}
		System.out.println(" Start COL  " + ColStartNO);
		
		int RowData = 0;
		Object[][] data = new Object[row][1];
		Hashtable<String, String> table = null; 
		for(int r=RowStartNo;r<RowStartNo+row;r++){
			table = new Hashtable<String,String>();
			for(int c=0;c<col;c++){
				String key = xls.getCellData(sheetName, c, ColStartNO);
				String value = xls.getCellData(sheetName, c, r);
				table.put(key, value);
			}
			data[RowData][0]=table;
			RowData++;
		}
		return data;
		
/*		Object[][] data = new Object[row][1];
		   int DataRow =0;
		   Hashtable<String,String> table = null;
		   for(int r=RowStartNo;r<RowStartNo+row;r++){
	             table = new Hashtable<String,String>();
			   for(int c=0;c<col;c++){
				   String key = xls.getCellData(sheetName, c, ColStartNO);
				   String value= xls.getCellData(sheetName, c, r);
				   table.put(key, value);
			   }
			   data[DataRow][0] = table;
			   DataRow++;
		   }
		    return data;*/
	}
}
