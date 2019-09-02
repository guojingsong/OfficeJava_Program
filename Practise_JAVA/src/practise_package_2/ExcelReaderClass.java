package practise_package_2;

import java.util.Hashtable;

public class ExcelReaderClass {

public static Object[][] getExcelData(Xls_Reader xls, String sheetName, String testCasesName){
	int testStart =1;
	while(!xls.getCellData(sheetName, 0, testStart).equals(testCasesName)){
		testStart++;
	}
	System.out.println(testStart);
	
	int rowStart =testStart+2;
	int colStart =testStart+1;
	
	int col=0;
	while(!xls.getCellData(sheetName, col, colStart).equals("")){
		col++;
	}
	System.out.println(colStart);
	
	int row =0;
	while(!xls.getCellData(sheetName, 0, rowStart+row).equals("")){
		row++;
	}
	System.out.println(rowStart);
	
	Object[][] d=new Object[row][1];
	int RD = 0;
	Hashtable<String, String> table =null;
	for(int r=rowStart;r<rowStart+row;r++){
		table = new Hashtable<String,String>();
		for(int c=0;c<col;c++){
			String key =xls.getCellData(sheetName, c, colStart);
			String value = xls.getCellData(sheetName, c, r);
			table.put(key, value);
		}
		d[RD][0]=table;
		RD++;
	}
     return d;
   }

}
