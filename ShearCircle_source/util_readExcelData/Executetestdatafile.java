package util_readExcelData;

import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Executetestdatafile {
	@Test	
	public void getdata() throws IOException {
		readExcelData file = new readExcelData();
		//Read keyword sheet
		Sheet testdataSheet = file.readExcel(System.getProperty("user.dir")+"\\","TestData\\TestData.xlsx" , "TestData");
		int rowCount = testdataSheet.getLastRowNum()-testdataSheet.getFirstRowNum();
		
		Reporter.log("Row Count"+rowCount); 
	    //Create a loop over all the rows of excel file to read it
	    for (int i = 0; i <= rowCount; i++) {
	        //Loop over all the rows
	        Row row = testdataSheet.getRow(i);	        
	        //Check if the first cell contain a value, if yes, That means it is the new testcase name
	        
	        //Reporter.log("Length", row.getCell(i).toString().length());  
	        if(row.getCell(0).toString().length()>0){
	        //Print testcase detail on console	   
	        	Reporter.log(row.getCell(0).toString()+", "+ row.getCell(1).toString()+", " +row.getCell(2).toString()+", "+ row.getCell(3).toString()  ); 
	        	/*Reporter.log(row.getCell(1).toString() ); 
	        	Reporter.log(row.getCell(2).toString() );    
	        	Reporter.log(row.getCell(3).toString() );    
	           	           */
	     }
	        else{
	            //Print the new testcase name when it started
	        	Reporter.log("Data Not Available"); 
	            }
	        }
	    }
	

}
