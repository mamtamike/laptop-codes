package learnXls;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToXls  {
	public static void main(String[] args) throws IOException{
	XSSFWorkbook workbook = new XSSFWorkbook();
	XSSFSheet sheet1= workbook.createSheet("sheet1");
	Row r0= sheet1.createRow(0);
	Cell c0= r0.createCell(0);
	c0.setCellValue("rcv");
	
	//create file
	File F =new File("C:\\eclipse_workspace\\ReadWriteXls\\src\\learnXls\\filedata\\TestData.xls");
	FileOutputStream fs=new FileOutputStream("F");
	workbook.write(fs); //write file reference into workbook
	workbook.close();
	System.out.println("file is written successfully");
	
	
	
	}
}
