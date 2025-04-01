package sample;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.Excelutility;
import genericUtility.IpathUtility;

public class FetchingDataFromExcelFilePractice {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(IpathUtility.animalExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Animal");
		Row r = sh.getRow(3);
		Cell c = r.getCell(1);
		//String value = c.getStringCellValue();
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(c);
		System.out.println(value);

		Excelutility eutil = new Excelutility();
		String value1 = eutil.getDataFromExcelFile("Animal", 0, 1);
		String value2 = eutil.getDataFromExcelFile("Animal", 2, 2);
		String value3= eutil.getDataFromExcelFile("Bird", 4, 1);
		String value4=eutil.getDataFromExcelFile("Bird", 2, 2);
		String value5= eutil.getDataFromExcelFile("Fish", 2, 1);
		String value6=eutil.getDataFromExcelFile("Fish", 3, 3);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		System.out.println("-------------");
	/*	String value7 = eutil.getDataFromExcelFile1("Leads", 5, 1);
		String value8 = eutil.getDataFromExcelFile1("Contacts", 2, 1);
		System.out.println(value7);
		System.out.println(value8);
	*/
	}

}
