package com.scripts;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndPrint {
    public static void main(String[] args) throws IOException {

        FileInputStream fl = new FileInputStream("C:\\Users\\sande\\OneDrive\\Desktop\\selenium\\java\\Book1.xlsx");

        XSSFWorkbook wb = new XSSFWorkbook(fl);
        XSSFSheet sheet = wb.getSheet("Sheet1");

        int lastRow = sheet.getLastRowNum();
        int totalRows = lastRow + 1;  
        System.out.println("Total Rows : " + totalRows);

        int totalCells = sheet.getRow(0).getLastCellNum();
        System.out.println("Total Cells: " + totalCells);

        for (int i = 0; i <= lastRow; i++) {     // <= to include last row
            XSSFRow row = sheet.getRow(i);

            if (row == null) continue; // skip null/empty rows

            for (int j = 0; j < totalCells; j++) {
                String data = "";

                if (row.getCell(j) != null) {
                    data = row.getCell(j).toString();
                }

                System.out.print(data + "   ");
            }
            System.out.println(); // new line after each row
        }

        wb.close();
        fl.close();
    }
}
