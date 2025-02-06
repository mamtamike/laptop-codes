package learnXls;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDatafromXl {
	public static void main(String[] args) throws IOException {
		File F=new File();
		FileInputStream fs=new FileInputStream(f);
		Workbook wb= WorkbookFactory.create(fs);
	//	Sheet sheet0=wb.getSheetAt(0);
		//Row row0=sheet0.getRow(0);
		//Cell cell0=row0.getCell(1);
				//System.out.println(cell0);
		F.close();
		for(Row row:sheet0) {
			for(Cell cell:row) {
				switch(cell.getCellType())
				{
				case STRING:
					System.out.print(cell.getStringCellValue()+" ");
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue()+" ");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue()+" ");
					break;
				default:
					break;
				}
			}
			System.out.println();
		})
	}
}

