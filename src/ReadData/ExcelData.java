package ReadData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	public Object[][] excelData(String FileName, int SheetIndex) throws IOException{
	    String file = System.getProperty("user.dir")+"/src/ReadData/"+FileName+".xlsx";
		FileInputStream FI = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(FI);
		XSSFSheet sheet = wb.getSheetAt(SheetIndex);
		XSSFCell cell;
		
		int RowCount = sheet.getLastRowNum();
		int ColCount = sheet.getRow(0).getLastCellNum();
		Object[][] exData = new Object[RowCount+1][ColCount];
		for(int i =0; i<=RowCount;i++) {
			for(int j=0; j<ColCount;j++) {
				cell = sheet.getRow(i).getCell(j);
				if(cell.getCellType().equals(CellType.STRING))
				{
					exData[i][j]=cell.getStringCellValue();
				}
				else if(cell.getCellType().equals(CellType.NUMERIC))
				{
					exData[i][j]=String.valueOf(cell.getNumericCellValue());	
				} else {
				exData[i][j]=cell.getRawValue();
				}
			}
		}
		return exData;
		
	}

}
