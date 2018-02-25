package au.com.seek.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	private static XSSFWorkbook ExcelWBook;
	private static XSSFSheet ExcelWSheet;

	public static void openExcelFile(String path) throws IOException {
		FileInputStream ExcelFile = new FileInputStream(path);
		ExcelWBook = new XSSFWorkbook(ExcelFile);

	}

	public static String[] getAllAccounts(String SheetName) {
		String[] accounts = null;
		int ColUsername = 0;
		int ColPassword = 0;

		ExcelWSheet = ExcelWBook.getSheet(SheetName);

		int FirstRowNum = ExcelWSheet.getFirstRowNum();
		int LastRowNum = ExcelWSheet.getLastRowNum();
		System.out.println("first row:" + FirstRowNum);
		int CellBegin = ExcelWSheet.getRow(FirstRowNum).getFirstCellNum();
		int CellEnd = ExcelWSheet.getRow(FirstRowNum).getLastCellNum();

		for (int i = CellBegin; i <= CellEnd; i++) {
			String CellData = ExcelWSheet.getRow(FirstRowNum).getCell(i).getStringCellValue();
			if (CellData == "Username") {
				ColUsername = i;
			}
			if (CellData == "Password") {
				ColPassword = i;
			}

			for (int n = 0, j = FirstRowNum + 1; j <= CellEnd; n += 2, j++) {
				accounts[n] = ExcelWSheet.getRow(j).getCell(ColUsername).getStringCellValue();
				accounts[n + 1] = ExcelWSheet.getRow(j).getCell(ColPassword).getStringCellValue();
			}

		}

		return accounts;
	}

}
