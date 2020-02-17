package jan26framework;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProvider extends ProjectMethods{
	

	
	public  String [][] getData() throws IOException {
		XSSFWorkbook wbook = new XSSFWorkbook(sheet);
		XSSFSheet sheet= wbook.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		int cellcount = sheet.getRow(0).getLastCellNum();
		String [][] data = new String [rowcount][cellcount];
		for(int i=1;i<rowcount;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<cellcount;j++) {
				XSSFCell cell= row.getCell(j);
				data[i-1][j]=cell.getStringCellValue();
				System.out.println(data);
			}
		}
		return null;
	}
}
