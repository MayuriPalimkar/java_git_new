package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class forloop {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Mayuri\\eclipse-workspace\\apache_poi\\Excel_sheets\\employee.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook work = new XSSFWorkbook(file);
		XSSFSheet sheet = work.getSheetAt(0);
		
		int rowcount = sheet.getLastRowNum();
		
		int colcount = sheet.getRow(1).getLastCellNum();
		
		for(int i =0;i<rowcount;i++) {
			XSSFRow row = sheet.getRow(i);
			
			for (int j =0; j<colcount; j++) {
				String value = row.getCell(j).toString();
				System.out.print("  "+value);
			}
			System.out.println();
			
		}

		
	}

}
