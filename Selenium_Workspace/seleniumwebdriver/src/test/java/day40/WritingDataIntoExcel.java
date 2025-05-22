package day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WritingDataIntoExcel {
	
	public static void main(String[] args) throws IOException {
		
	//Excel File--Workbook--Sheet---Rows---Cells
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\Book2.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		

		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Data");
		row1.createCell(1).setCellValue(1);
		row1.createCell(2).setCellValue("Analyst");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("RnD");
		row2.createCell(1).setCellValue(1.1);
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created and saved successfully...");
	}

}
