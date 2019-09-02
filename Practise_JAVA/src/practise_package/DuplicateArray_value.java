package practise_package;

import java.util.Hashtable;

public class DuplicateArray_value {
    public static Xls_Reader xls;
	public static Object[][] getExcelData_test(String sheetName,String testCaseName) {
		xls = new Xls_Reader("D://Test_Excel.xlsx");
		System.out.println(xls.getCellData(sheetName, 1, 2));
		int testStart = 1;
		while(!xls.getCellData(sheetName, 0, testStart).equals(testCaseName)){
			testStart++;
		}
		System.out.println("testStart   -- " + testStart);
		
		int rowStart= testStart+2;
		int colStart = testStart+1;
		int row=0;
		while(!xls.getCellData(sheetName, 0, rowStart+row).equals("")){
			row++;
		}
		System.out.println("rowStart   -- " + rowStart);
		
		int col=0;
		while(!xls.getCellData(sheetName, col, colStart).equals("")){
			col++;
		}
		System.out.println("rowStart   -- " + colStart);
		
		int RD=0;
		Object[][] o=new Object[row][1];
		Hashtable<String,String> table=null;
		for(int r=rowStart;r<rowStart+row;r++){
			table = new Hashtable<String,String>();
			for(int c=0;c<col;c++){
				String keys = xls.getCellData(sheetName, c, colStart);
				String values = xls.getCellData(sheetName, c, r);
				table.put(keys, values);
			}
			o[RD][0]=table;
			RD++;
		}
		return o;
	}		 
}	
	/*
		int n = 6;
		int sum=1;
		for(int i=1;i<=n;i++){
			sum = sum*i;
		}
		System.out.println(sum);
		
		
		
		int table; int n=18;
		for(int i=1;i<=10;i++){
			table = n*i;
			System.out.println(table);
		}*/
		
		
		/*int temp,r,s=0,n=1234321;
		temp =n;
		while(n!=0){
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		if(temp == s){
			System.out.println("palindrom");
		}else{
			System.out.println("not");
		}
		*/
		
		
		/*     int n[] ={2,5,3,2,5,657,543,43,3,23,43};
      for(int i=0;i<n.length;i++){
    	  for(int j=1+i;j<=n.length;j++){
    		  if(n[i]==n[j]){
    			  System.out.println("Duplicate -- > " + n[i]);
    		  }
    	  }
      }
      System.out.println(Arrays.toString(n));
      Set<Integer> set = new HashSet<Integer>();
      for(int i=0;i<n.length;i++){

        if(set.add(n[i])==false){
        	System.out.println("Duplicate -- > " + n[i]);
        } 
      }
      
      Scanner  sc=new Scanner(System.in);
      System.out.println("Enter number -- -> ");
	  int number = sc.nextInt();
	  int digit; int sum=0;
	  while(number>0){
		  digit = number%10;
		  sum=sum*10+digit;
		  number= number/10;
	  }
	  System.out.println(sum);
	  
	  System.out.println();
	  int num=67890;
	  String ss = String.valueOf(num);
	  StringBuffer sb=new StringBuffer(ss);
	  System.out.println(sb.reverse());

	  String sss="manoj";
	  for(int i=sss.length()-1;i>=0;i--){
		  System.out.print(sss.charAt(i));
	  }
	  
	  System.out.println();
	  String s1[] = {"32","4324","sdsa"};
	  for(int i=s1.length-1;i>=0;i--){
		  System.out.print(s1[i]+",");
	  }
      System.out.println();
*/

