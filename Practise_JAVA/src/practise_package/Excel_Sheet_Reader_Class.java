package practise_package;

public class Excel_Sheet_Reader_Class {
	
	public static void main(String[] args){
		Xls_Reader xls =new Xls_Reader("D://Test_Excel.xlsx");
		String sheetName ="Sheet";
		int RowCount = xls.getColumnCount(sheetName);
		int ColCount = xls.getColumnCount(sheetName);
		
		System.out.println(xls.getCellData(sheetName, 2, 1));
		
		System.out.println(RowCount);
		System.out.println(ColCount);
		
		for(int r=1;r<RowCount;r++){
			for(int c=0;c<ColCount;c++){
				System.out.print(xls.getCellData(sheetName, c, r)+ " | ");
			}
			System.out.println();
		}
	}
}
