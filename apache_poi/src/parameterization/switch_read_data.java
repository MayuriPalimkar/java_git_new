package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class switch_read_data {

	public static void main(String[] args) throws IOException {
String Path ="C:\\Users\\Mayuri\\eclipse-workspace\\apache_poi\\Excel_sheets\\employee.xlsx";
		
		FileInputStream File = new FileInputStream(Path);
		
		// 1. Print HR manager Values 
		
		//String Data1 = WorkbookFactory.create(File).getSheet("Sheet1").getRow(3).getCell(3).getStringCellValue();
		
         //System.out.println(Data1);
		
		
		// 2.Print All the Data Using Switch Statement.
		
        XSSFWorkbook Workbook = new XSSFWorkbook(File);
		
		XSSFSheet Sheet = Workbook.getSheetAt(0);
		
		int Row = Sheet.getLastRowNum();
		System.out.println(Row);
		int Col = Sheet.getRow(1).getLastCellNum();
		System.out.println(Col);
		
		for(int R=0; R<Row; R++) {
			
			XSSFRow Row1 = Sheet.getRow(R);

			
			for(int C=0; C<Col; C++) {
				
				XSSFCell Cell = Row1.getCell(C);
				
				switch(Cell.getCellType()) {
				
				case STRING:
					System.out.println(Cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.println(Cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.println(Cell.getBooleanCellValue());
					break;
				default:
					break;
				}
				System.out.println(" || ");
					
			}
		    System.out.println();
			
		}
			


	}

}
