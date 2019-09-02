package practise_package;

import java.util.Hashtable;

public class Excel_Test_Data_Read {
	public static Object[][] getSheet_TestData(String testcaseName,String sheetName, Xls_Reader xls) {
		int testStart=1;
		while(!xls.getCellData(sheetName, 0, testStart).equals(testcaseName)){
			testStart++;
		}
		System.out.println("testStart" + testStart);
		
		
		int rowStart=testStart+2;
		int colStart=testStart+1;
		
		int row=0;
		while(!xls.getCellData(sheetName, 0, rowStart+row).equals("")){
			row++;
		}
		System.out.println("rowStart" + rowStart);
		
		
		int col=0;
		while(!xls.getCellData(sheetName, col, colStart).equals("")){
			col++;
		}
		System.out.println("colStart" + colStart);
		
		int ROWDATA=0;
		Object[][] o=new Object[row][1];
		Hashtable<String,String> table=null;
		for(int r=rowStart;r<rowStart+row;r++){
			table =new Hashtable<String,String>();
			for(int c=0;c<col;c++){
				String key = xls.getCellData(sheetName, c, colStart);
				String value = xls.getCellData(sheetName, c, r);
				table.put(key, value);
			}
			o[ROWDATA][0]=table;
			ROWDATA++;
		}
		return o;
		
/*		int RowData=0;
		Object[][] data = new Object[row][1];
		Hashtable<String, String> table=null;
		for(int r=rowStart;r<rowStart+row;r++){
			table = new Hashtable<String,String>();
			for(int c=0;c<col;c++){
				String key = xls.getCellData(sheetName, c, colStart);
				String value = xls.getCellData(sheetName, c, r);
				table.put(key, value);
			}
			data[RowData][0]=table;
            RowData++;
		}
		return data;*/
	}

}
