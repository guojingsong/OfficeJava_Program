package practise_package;

public class Read_Excel_Test_data {
	
	public static void main(String[] args){
		System.out.println("MANOJ KUSHWAHA");
		Xls_Reader xls=new Xls_Reader("D://Test_Excel.xlsx");   //Test_Excel.xlsx  -- Test_Excel
		String sheetName="Sheet2";
		String testName = "TCID-02";
		int testStart = 1;
		while(!xls.getCellData(sheetName, 0, testStart).equals(testName)){
			testStart++;
		}
		System.out.println("testStart -- > " + testStart);
		
		int rowStart=testStart+2;
		int colStart=testStart+1;
		int row=0;
		while(!xls.getCellData(sheetName, 0, rowStart+row).equals("")){
			row++;
		}
		System.out.println("rowStart -- > " + rowStart);
		
		int col=0;
		while(!xls.getCellData(sheetName, col, colStart).equals("")){
			col++;
		}
		System.out.println("colStart -- > " + colStart);
		
		Object[][] obj =new Object[row][1];
		
		
	}

}
