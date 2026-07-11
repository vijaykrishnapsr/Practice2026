package vijay;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelData {

	@Test
	public void extractdata() throws IOException {

		FileInputStream file = new FileInputStream("/Users/vijayakrishnamoorthy.cellasamy/eclipse-workspace/MCA/src/test/resources/Book1.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
	     XSSFSheet sheet = book.getSheetAt(0);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				String stringCellValue = row.getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
			}

		}

		book.close();

	}

}
