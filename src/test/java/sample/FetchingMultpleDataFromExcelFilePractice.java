package sample;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import genericUtility.JavaUtility;

public class FetchingMultpleDataFromExcelFilePractice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
/*	FileInputStream fis = new FileInputStream(excelPathDemo);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Animal");
		DataFormatter df = new DataFormatter();
		for(int i=1; i<=sh.getLastRowNum(); i++)
		{
			Row r= sh.getRow(i);
			for(int j=0; j<r.getLastCellNum(); j++)
			{
				Cell c = r.getCell(j);
				String value = df.formatCellValue(c);
				System.out.println(value+""); 
			}
		}
	*/
//		ExcelUtility eUtil = new ExcelUtility();
//		List<String> value = eUtil.getMultpleDataFromExcelFilePractice("Animal", 1, 0);
//		System.out.println(value);

		JavaUtility jUtil = new JavaUtility();
		int value = jUtil.generateRandomNumber(1000);
		System.out.println(value);
		
		String dateStamp = jUtil.getCalendaretails("dd-M-YYYY");
		System.out.println(dateStamp);
		
		String dateTimeStamp = jUtil.getCalendaretails("dd-M-YYYY hh-mm-ss");
		System.out.println(dateTimeStamp);
	}

}
