package com.app.TestNG.DataDrivenTesting;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDatainExcel {
	
	
	public static void main(String[] args) throws IOException {
		
		
	XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheetone = workbook.createSheet("mysheet");
		
		// send data 4 row and 2column cell values
		
		Object [][] data = {{"Name","Location"},
				            {"Sonal","Gurgaon"},
				            {"Ravi","Hyderabad"},
				            {"Jaya","Bangalore"}};
		
		int rows = data.length;
		int columns = data[0].length;
		
		for(int r=0;r<rows;r++) // to go to each row in excel sheet
			
		{
			
			 XSSFRow row=  sheetone.createRow(r); // create a new row in the sheet and retrun a highlevel representation of it
			 
			 // create columns and set cell value
			
		for(int c=0;c<columns;c++)	{
			
			XSSFCell cell = row.createCell(c);
			
			        Object cellValue   = data[r][c]; // get cell value from data array
			        
			        cell.setCellValue((String)cellValue); // insert value in each cell. value is of type string
		}
		
		}
			
		// give the location where excel needs to be created
		
		String excelpath = "C:\\Users\\sonal\\Desktop\\mytestdata\\Employees.xlsx";
			
		File excelfile = new File(excelpath);  // location of sheet
		
		FileOutputStream fos = new FileOutputStream(excelfile);  // create the sheet on the location
		
		workbook.write(fos);  // fetch the workbook and write into the sheet
		
		workbook.close();
		
		System.out.println("task completed");
		
		
		}
		
	
		
		
		
		
	
	}


