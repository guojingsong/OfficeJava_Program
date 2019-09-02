package pom;

import java.util.Hashtable;

public class ExcelFile_Reading {
	  
	public static Object[][] getExcelData_Aug(Xls_Reader xls,String sheetName, String testcase)
	{
		int testStart =1;
		while(!xls.getCellData(sheetName, 0, testStart).equals(testcase)){
			testStart++;
		}
		System.out.println(testStart);
		
		int rowStart = testStart+2;
		int colStart = testStart+1;
		int row = 0;
		while(!xls.getCellData(sheetName, 0, rowStart+row).equals("")){
			row++;
		}
		System.out.println(rowStart);
		
		int col = 0;
		while(!xls.getCellData(sheetName, col, colStart).equals("")){
			col++;
		}
		System.out.println(colStart);
		
		Object[][] data = new Object[row][1];
		int RD=0;
		Hashtable<String,String> table;
		for(int r=rowStart;r<rowStart+row;r++){
			table=new Hashtable<String,String>();
			for(int c=0;c<col;c++){
				String key = xls.getCellData(sheetName, c, colStart);
				String value = xls.getCellData(sheetName, c, r);
				table.put(key, value);
			}
			data[RD][0]=table;
		}
		return data;
		
	}
}
