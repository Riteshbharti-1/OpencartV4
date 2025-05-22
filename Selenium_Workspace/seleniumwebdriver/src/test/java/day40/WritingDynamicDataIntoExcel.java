package day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WritingDynamicDataIntoExcel {
	
	public static void main(String[] args) throws IOException {
		
	//Excel File--Workbook--Sheet---Rows---Cells
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\Book3.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many rows?");
		int noOfRows = sc.nextInt();
		

		System.out.println("How many cells?");
		int noOfCells = sc.nextInt();
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created and saved successfully...");
	}

}
