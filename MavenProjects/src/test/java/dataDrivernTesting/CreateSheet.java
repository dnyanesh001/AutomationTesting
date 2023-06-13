package dataDrivernTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class CreateSheet {
	@Test
	public void createSheet() throws IOException {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\AppData\\ManualNotes.xlsx");
		Workbook workbook=new XSSFWorkbook(fis);
		workbook.createSheet();
		
		Sheet sheet=workbook.createSheet("DemoSheet");
		sheet=workbook.getSheet("DemoSheet");
		Row row=sheet.createRow(5);
		Cell cell;
		for(int i=0;i<sheet.getLastRowNum();i++) {
			row=sheet.getRow(i);
			for(int j=0;j<4;j++) {
				cell=row.createCell(j);
				cell.setCellType(j);
			}
		}
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\AppData\\ManualNotes.xlsx");
		workbook.write(fos);
		fos.close();
	}
}
