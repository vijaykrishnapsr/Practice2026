package vijay;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class dataProviderExcel {


	public String[][] excelData() throws IOException, BiffException {

		FileInputStream file = new FileInputStream("//Users//vinoth.seetharaman//Downloads//Book.Xls");

	   Workbook workbook = Workbook.getWorkbook(file);
	   Sheet sheet = workbook.getSheet(0);
		int columnCount = sheet.getColumns();
		int rowCount = sheet.getRows();

	    String newData[][] = new String [rowCount-1][columnCount];
	    for(int i=1; i<rowCount; i++) {

	    	for (int j=0; j<columnCount; j++) {

	    		newData[i-1][j] = sheet.getCell(j,i).getContents();
	    	}
	    }
		return newData;
	}

}
