	package com.scripts;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadData {
    public static void main(String[] args) throws IOException {

        FileInputStream fl = new FileInputStream("C:\\Users\\sande\\OneDrive\\Desktop\\selenium\\java\\propeties File\\Book1.xlsx");

        XSSFWorkbook wb = new XSSFWorkbook(fl);
        XSSFSheet sheet = wb.getSheet("Sheet1");

        int countRow = sheet.getLastRowNum();
        System.out.println("No of rows: " + countRow);

        int cell = sheet.getRow(0).getLastCellNum();
        System.out.println("No of cells: " + cell);

        wb.close();
        fl.close();   // IMPORTANT → releases file lock
    }
}

