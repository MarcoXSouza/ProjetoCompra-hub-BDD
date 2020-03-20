package br.com.rsinet.web_Project_BDD.Utilitys;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	private static XSSFSheet excelWSheet;
	private static XSSFWorkbook excelWorkbook;
	private static XSSFCell cell;

	public static void setExcelFile(String path, String sheetName) throws Exception {
		
		try {
			FileInputStream file = new FileInputStream(path);
			excelWorkbook = new XSSFWorkbook(file);
			excelWSheet = excelWorkbook.getSheet(sheetName);

		} catch (Exception e) {
			throw (e);
		}

	}

	public static String getCellData(int linhaNum, int colunaNum) {

		try {
			cell = excelWSheet.getRow(linhaNum).getCell(colunaNum);

			String cellData = cell.getStringCellValue();

			return cellData;

		} catch (Exception e) {
			return "";
		}

	}
}
