package com.selenium.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.annotation.processing.RoundEnvironment;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.examples.CellStyleDetails;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	static FileInputStream fis = null;
	static FileOutputStream fos = null;
	static File f = null;
	static Workbook wb = null;

	
	public static String getMyCellValue(String sheetname, int rownumber, int cellnumber)
	{
		String cellValue=null;
		Workbook wb = getMyExcelObject();
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rownumber);
		
		 cellValue = getMyCellValue(row.getCell(cellnumber));
		 try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return cellValue; 
			
	}
	
	
	public static Workbook getMyExcelObject()
	{
		f = new File("data//TestData_Actitime.xls");
		try {
			fis = new FileInputStream(f);
			wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return wb;
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		f = new File("data//TestData_Actitime.xls");
		fis = new FileInputStream(f);

		wb = WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet("Sheet3");
		int rowCount = sh.getLastRowNum() + 1;
		System.out.println("Total number of rows -->" + rowCount);

		Row row;
		Cell cell1, cell2;
		for (int i = 0; i < rowCount; i++) {
			row = sh.getRow(i);
			cell1 = row.getCell(0);
			cell2 = row.createCell(1);
			cell2.setCellValue("PASS");
			System.out.println(getMyCellValue(cell1));
		}
		fos = new FileOutputStream(f);
		wb.write(fos);
		fos.close();
		fis.close();

	}

	private static String getMyCellValue(Cell cell) {
		String cellValue = null;
		System.out.println("getting cell value for a type " + cell.getCellType().toString());
		switch (cell.getCellType().toString()) {
		case "STRING":
			cellValue = cell.getStringCellValue();
			break;
		case "NUMERIC":
			cellValue = String.valueOf(cell.getNumericCellValue());

			break;
		case "BOOLEAN":
			cellValue = String.valueOf(cell.getBooleanCellValue());
			break;
		case "FORMULA":
			cellValue = String.valueOf(cell.getCellFormula());

			break;

		default:
			System.out.println("cell type is not added , please contact FW Developemt team" + cell.getCellType().toString());
			break;
		}
		return cellValue;
	}

	private static void getSheetCount() {
		System.out.println("Total sheets present --" + wb.getNumberOfSheets());

		for (int i = 0; i < wb.getNumberOfSheets(); i++) {
			System.out.println(wb.getSheetName(i));

		}
	}
	
	public  static int getExcelRowCount(String sheetname)
	{
		Workbook wb = getMyExcelObject();
		Sheet sh = wb.getSheet(sheetname);
		return (sh.getLastRowNum()+1);
		
	}
}
