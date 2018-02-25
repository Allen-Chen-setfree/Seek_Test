package au.com.seek.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Excel {

	//private static XSSFWorkbook ExcelWBook;

	public static void openExcelFile(String path) throws FileNotFoundException {
		FileInputStream ExcelFile = new FileInputStream(path);
		//ExcelWBook = new XSSFWorkbook(ExcelFile);

	}

}
