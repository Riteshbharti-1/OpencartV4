package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {
	
	public static void main(String[] args) throws IOException {
		
	//Excel File--Workbook--Sheet---Rows---Cells
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Book1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Beneficiay_Sample_CSV");
		
		int totalrows = sheet.getLastRowNum();
		int totalcells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total number of rows "+totalrows); //as per excel rows counting starts from 0
		System.out.println("Total number of cells "+totalcells); // and cells counting starts from 1
		
		for(int r=0; r<=totalrows; r++)  //as per java rows and columns counting starts from 0 hence r and c starts from 0
		{
			XSSFRow currentrows = sheet.getRow(r);
			
			for(int c=0; c<totalcells; c++)
			{
				XSSFCell cell = currentrows.getCell(c);
				System.out.print(cell.toString()+"     \t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}

}
