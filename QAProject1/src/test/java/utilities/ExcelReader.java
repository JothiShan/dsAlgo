package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public static String[][] getData(String sheetname) throws IOException
	{
		String projectDir=System.getProperty("user.dir");
		String path=projectDir+"/src/test/resources/testdata/testcase.xlsx";
		File ExcelFile= new File(path);
		FileInputStream FIS= new FileInputStream(ExcelFile);
		XSSFWorkbook workbook= new XSSFWorkbook(FIS);
		XSSFSheet sheet=workbook.getSheet(sheetname);
		int row= sheet.getLastRowNum();
		System.out.println("rows"+row);
		Row rowcell=sheet.getRow(0);
		int totcol=rowcell.getLastCellNum();
		System.out.println("column"+totcol);
		DataFormatter format= new DataFormatter();
		String testdata[][]= new String[row][totcol];
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<totcol;j++)
			{
				testdata[i-1][j]=format.formatCellValue(sheet.getRow(i).getCell(j));
				
			}
		}
		
		return testdata;
	}
	
	

}
