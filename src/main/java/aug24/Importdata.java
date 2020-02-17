package aug24;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Importdata {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wbook= new XSSFWorkbook("");
		XSSFSheet sheet=wbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
		
		int rowcount = sheet.getLastRowNum();
		int cellcount=sheet.getRow(0).getLastCellNum();
		for(int i=1;i<=rowcount;i++) {
			XSSFRow rows=sheet.getRow(i);
					for(int j=0;j<cellcount;j++) {
						XSSFCell cells=rows.getCell(j);
						System.out.println(cells.getStringCellValue());
					}
		}
		
		int rowcount1 = sheet.getLastRowNum();
		int cellcount1 = sheet.getRow(0).getLastCellNum();
		String[][] data = new String [rowcount1][cellcount1];
		for(int i=1;i<=rowcount1;i++) {
			XSSFRow rows1=sheet.getRow(i);
					for(int j=0;j<cellcount1;j++) {
						XSSFCell cells1=rows1.getCell(j);
						data[i-1][j]=cells1.getStringCellValue();
						System.out.println(data);
					}
		}
	
	
	
	}
}
