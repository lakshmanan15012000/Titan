package GenericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getDataFromExcelFile(String sheetname, int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(IpathUtility.excelfile);
		Workbook wb = WorkbookFactory.create(fis);
		Cell cell=wb.getSheet(sheetname).getRow(rowIndex).getCell(cellIndex);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(cell);
		return value;
	}
		
		public void WritringDataToExcelFile(String sheetname, int rowindex, int cellindex, String value) throws EncryptedDocumentException, IOException {
			FileInputStream fis=new FileInputStream(IpathUtility.excelfile);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheetname);
			Row r=sh.createRow(rowindex);
			Cell cell=r.createCell(cellindex);
			cell.setCellValue(value);
			FileOutputStream fos=new FileOutputStream(IpathUtility.excelfile);
			wb.write(fos);
						
		}

		
		
		



}