package sample;

import genericUtility.Excelutility;

public class writingDataToExcelFileProperties {

	public static void main(String[] args) throws Exception {
//		FileInputStream fis = new FileInputStream("U:\\SDET\\Selenium\\Animal.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Animal");
////		Row r = sh.createRow(2);
//// 	Cell c = r.createCell(2);
////       c.setCellValue("Hello");
//		
//		Row row= sh.createRow(3);
//		Cell c= row.createCell(3);
//		c.setCellValue("lotus");
//		FileOutputStream fos = new FileOutputStream("U:\\SDET\\Selenium\\Animal.xlsx");
//		wb.write(fos);
		
		Excelutility eUtil = new Excelutility();
		eUtil.writeDatatoExcelFile("Leads", 10, 1, "Hello");

		
	}

}
