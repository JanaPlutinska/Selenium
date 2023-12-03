package Selenium;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncrypptedDocumentException;
import org.apache.poi.openxml4j.exeptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary {
	public String getExcelData(String sheetnamee, int rowNum, int cellNum) {
		String retVal = null;
		try {
			FileInputStream fis = new FileInputStrem ("C:\\Users\\rasti\\OneDrive\\Počítač\\ExcelLibrary.xlsx\");
					Workbook wb = WorkbookFactory.create(fis);
					Sheet s = wb.getSheet(sheetname);
					Row r = s.getRow(ronNum);
					Cell c = r.getCell(CellNum);
					retVal = c.getStringCellValue();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(com.sun.media.sound.InvalidFormatException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return retVal;
	}
	public int getLastRowNumber(String sheetname) {
		int retVal = 0;
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\rasti\\OneDrive\\Počítač\\ExcelLibrary.xlsx\");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetname);
			retVal = s.getLastRowNum();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
	}

}
