package dataDrivernTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class UpdateExcel1 extends SeleniumUtility {
	String appUrl;
	String userName;
	String password;	
	String expectedTitle;
	@BeforeTest
	public void getData() {
		appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\ManualNotes.xlsx", "TC", 1, 0);
		userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\ManualNotes.xlsx", "TC", 1, 1);
		password=ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\ManualNotes.xlsx", "TC", 1, 2);
		expectedTitle=ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\ManualNotes.xlsx", "TC", 1, 3);
	}
	@Test
	public void TC() throws IOException {
		FileInputStream fis = new FileInputStream("D:\\\\Elcips2\\\\Workspace\\\\MavenProjects\\\\src\\\\test\\\\resources\\\\AppData\\\\ManualNotes.xlsx");
		// create an instance of required workbook class and pass FileInputStream instance to its constructor
		Workbook workbook = new XSSFWorkbook(fis);
		// get the required sheet from excel
		Sheet sheet = workbook.getSheet("TC");
		// get specific row from the sheet
		Row row=sheet.getRow(1);
		//create cell to update the data
//		Cell cell=row.createCell(3);
		System.out.println(row.getLastCellNum());
			WebDriver driver=setUp("chrome", appUrl);			
			typeInput(driver.switchTo().activeElement(),userName);
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
			typeInput(driver.switchTo().activeElement(),password);
			driver.switchTo().activeElement().sendKeys(Keys.TAB,Keys.ENTER);
			String actualTitle=driver.getTitle();
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\ManualNotes.xlsx", "TC", 1, 4,actualTitle);
			if(getPageTitle(expectedTitle).equals(actualTitle)) {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\ManualNotes.xlsx", "TC", 1, 5,"Passed");
			}else {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\ManualNotes.xlsx", "TC", 1, 5,"Failed");
			}
			Assert.assertEquals(getPageTitle(expectedTitle), actualTitle);
			cleanUp();
	}
}
