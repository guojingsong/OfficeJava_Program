package practise_package;

import java.util.Hashtable;

public class ExcelReader_Class {
	
	public static Object[][] excel_Reader(Xls_Reader xls, String testCaseName, String SheetName){
		String sheetName = SheetName;
		int testStartRow = 1;
		while(!xls.getCellData(sheetName, 0, testStartRow).equals(testCaseName)){
			testStartRow++;
		}
		System.out.println("Test Start Row -----> " + testStartRow);
		
		int rowStartNo = testStartRow+2;
		int colStartNo = testStartRow+1;
		
		int row=0;
		while(!xls.getCellData(sheetName, 0, rowStartNo+row).equals("")){
			row++;
		}
		System.out.println("Row Start Number ----> " + rowStartNo);
		
		int col=0;
		while(!xls.getCellData(sheetName, col, colStartNo).equals("")){
			col++;
		}
		System.out.println("Col Start Number ----> " + colStartNo);
		
		int RowData=0;
		Object[][] data = new Object[row][1];
		Hashtable<String, String> table=null;
		for(int r=rowStartNo;r<rowStartNo+row;r++){
			table = new Hashtable<String,String>();
			for(int c=0;c<col;c++){
				String key = xls.getCellData(sheetName, c, colStartNo);
				String value = xls.getCellData(sheetName, c, r);
				table.put(key, value);
			}
			data[RowData][0]=table;
            RowData++;
		}
		return data;
  }
}
