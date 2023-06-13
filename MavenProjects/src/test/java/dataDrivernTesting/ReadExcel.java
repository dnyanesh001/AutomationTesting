package dataDrivernTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	/**
	 * 1.Excel File location with file name --->FileInputStream
	 * 		1.1 Workbook -->Define the excel type workbook -->XSSWorkbook
	 * 2.Sheet name-->						      Sheet -->XSSSheet
	 * 3.Row	   -->							  Row -->XSSRow
	 * 4.Colon     -->							  Cell-->XSSCell
	 * @throws IOException 
	 */
	@Test
	public void sheetsOps() throws IOException{
		FileInputStream fis=new FileInputStream("D:\\Elcips2\\Workspace\\MavenProjects\\src\\test\\resources\\AppData\\ManualNotes.xlsx");
//		XSSFWorkbook xworkbook= new XSSFWorkbook(fis);
//		or
		Workbook workbook=new XSSFWorkbook(fis);
		//after getting workbook you can perform any operation on sheet
		int sheetCT=workbook.getNumberOfSheets();
		System.out.println("Sheet count is: "+sheetCT);
		for(int i=0;i<sheetCT;i++)
		{
//			Sheet sheet=workbook.getSheetAt(i);
//			String sheetName=sheet.getSheetName();
//			System.out.println("The name of sheet is: "+sheetName);
			System.out.println("The name of sheet is: "+workbook.getSheetAt(i).getSheetName());
		}
		Sheet sheet=workbook.getSheet("API tesing");
	}
	@Test
	public void rowOps() throws IOException { 
		//excel file location 
		FileInputStream fis=new FileInputStream("D:\\Elcips2\\Workspace\\MavenProjects\\src\\test\\resources\\AppData\\ManualNotes.xlsx");
		//create Instance  of required workbook based on excel Type
		Workbook workbook=new XSSFWorkbook(fis);
		//using workbook object get th required sheet
		Sheet sheet=workbook.getSheet("API tesing");
		//get the row count using sheet class object 
		int rowCt=sheet.getLastRowNum();
		System.out.println("Row count in API testing: "+rowCt);
		//get specif row from the sheet
		Row row=sheet.getRow(1);
		System.out.println("The selected row is: "+row);
	}
	@Test
	public void cellsOps() throws IOException {
		//excel file location 
				FileInputStream fis=new FileInputStream("D:\\Elcips2\\Workspace\\MavenProjects\\src\\test\\resources\\AppData\\ManualNotes.xlsx");
				//create Instance  of required workbook based on excel Type
				Workbook workbook=new XSSFWorkbook(fis);
				//using workbook object get th required sheet
				Sheet sheet=workbook.getSheet("API tesing");
				//get the row count using sheet class object 
				int rowCt=sheet.getLastRowNum();
				System.out.println("Row count in API testing: "+rowCt);
				//get specif row from the sheet
				Row row=sheet.getRow(1);
				//get column count from row 0
				int cellCountInRow0=row.getLastCellNum();
				System.out.println("Cell count in row 0 is: "+cellCountInRow0);
				//print row0 data 
				for(int i=0;i<cellCountInRow0;i++) {
					//get one by one cell from cell 0
					Cell cell=row.getCell(i);
					String cellValue=cell.getStringCellValue();
					System.out.println("Row-0 cell value from column number: "+i+" :"+cellValue);
				}
	}
	public void readDiffrentTypesOfDataFromExcell() throws IOException {
		//excel file location 
		FileInputStream fis=new FileInputStream("D:\\Elcips2\\Workspace\\MavenProjects\\src\\test\\resources\\AppData\\ManualNotes.xlsx");
		//create Instance  of required workbook based on excel Type
		Workbook workbook=new XSSFWorkbook(fis);
		//using workbook object get th required sheet
		Sheet sheet=workbook.getSheet("API tesing");
		//get the row count using sheet class object 
		int rowCt=sheet.getLastRowNum();
		System.out.println("Row count in API testing: "+rowCt);
		//get specif row from the sheet
		Row row=sheet.getRow(1);
		//get column count from row 0
		int cellCountInRow0=row.getLastCellNum();
		System.out.println("Cell count in row 0 is: "+cellCountInRow0);
		//print row0 data 
		for(int i=0;i<cellCountInRow0;i++) {
			//get one by one cell from cell 0
			Cell cell=row.getCell(i);
			switch(cell.getCellType()) {
			case Cell.CELL_TYPE_STRING:
				System.out.println("Row-0 cell value column number: "+i+" :"+cell.getStringCellValue());
				break;
			case Cell.CELL_TYPE_NUMERIC:
				System.out.println("Row-0 cell value column number: "+i+" :"+cell.getNumericCellValue());
				break;
			case Cell.CELL_TYPE_BOOLEAN:
				System.out.println("Row-0 cell value column number: "+i+" :"+cell.getBooleanCellValue());
				break;
			case Cell.CELL_TYPE_BLANK:
				System.out.println("Row-0 cell value column number: "+i+" :"+"*******Empty Cell*******");
				break;
				default:
					System.out.println("#####Invalid cell value######");
			}
			String cellValue=cell.getStringCellValue();
			System.out.println("Row-0 cell value from column number: "+i+" :"+cellValue);
		}
	}
	public int getSheetCount(String fileLocation) {
		return 0;
		
	}
	public int getRowCount(String fileLocation,String sheetName,int row)
	{
		return row;
		
	}
	public String getCellValue(String fileLocation,String sheetName,int row,int rowIndex) {
		return sheetName;
		
	}
	@Test
	public void UpdateCellDetail() throws IOException{
		// Create instance of FileInputStream class and pass the required excel file location to its constructor
				FileInputStream fis = new FileInputStream("D:\\\\Elcips2\\\\Workspace\\\\MavenProjects\\\\src\\\\test\\\\resources\\\\AppData\\\\ManualNotes.xlsx");
				// create an instance of required workbook class and pass FileInputStream instance to its constructor
				Workbook workbook = new XSSFWorkbook(fis);
				// get the required sheet from excel
				Sheet sheet = workbook.getSheet("Sheets");
				// get specific row from the sheet
				Row row=sheet.getRow(1);
				//create cell to update the data
				Cell cell=row.createCell(3);
				cell.setCellValue("Passed");
				
				//to store the update data find the location to save the file
				FileOutputStream fos=new FileOutputStream("D:\\\\Elcips2\\\\Workspace\\\\MavenProjects\\\\src\\\\test\\\\resources\\\\AppData\\\\ManualNotes.xlsx");
				//write the content in to the required file
				workbook.write(fos);
				//close the connection
				fos.close();		
				System.out.println("File Updated...");
			}
			
			@Test
			public void updateSheetDetails() throws IOException {
				// Create instance of FileInputStream class and pass the required excel file location to its constructor
				FileInputStream fis = new FileInputStream("D:\\\\Elcips2\\\\Workspace\\\\MavenProjects\\\\src\\\\test\\\\resources\\\\AppData\\\\ManualNotes.xlsx");
				// create an instance of required workbook class and pass FileInputStream instance to its constructor
				Workbook workbook = new XSSFWorkbook(fis);
				//TODO: create new sheet
				//TODO: create multiple rows(3)
				//TODO: create 3 cell in each row
				//TODO: add different type of values
				
				//to store the update data find the location to save the file
				FileOutputStream fos=new FileOutputStream("D:\\\\Elcips2\\\\Workspace\\\\MavenProjects\\\\src\\\\test\\\\resources\\\\AppData\\\\ManualNotes.xlsx");
				//write the content in to the required file
				workbook.write(fos);
				//close the connection
				fos.close();		
				System.out.println("File Updated...");
			}
	}
