package com.scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteInExcel {
	
	public static void Write(String  sheetname,String cellvalue,int row,int cell) throws IOException {
		String excel_path="C:\\Users\\sande\\OneDrive\\Desktop\\selenium\\java\\Book2.xlsx";
		File f=new File(excel_path);
		
		FileInputStream fi=new FileInputStream(f);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		
		XSSFSheet sheet=wb.getSheet(sheetname);
		
		sheet.getRow(row).createCell(cell).setCellValue(cellvalue);
		
		FileOutputStream fo=new FileOutputStream(new File(excel_path));
		wb.write(fo);
		fi.close();
		fo.close();
		
		
		
	}

	

}
