package task13;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ReadingExcelFile {
    public static void main(String[] args) throws IOException {

       // FileInputStream fileInputStream = new FileInputStream("src/main/resources/Task13.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook("src/main/resources/Task13.xlsx");

        XSSFSheet sheet = workbook.getSheetAt(0);

        int rowCount = sheet.getLastRowNum();
        int columnCount = sheet.getRow(0).getLastCellNum();
        String[][] data = new String[rowCount][columnCount];

        for(int i=1;i<=rowCount;i++)
        {
            XSSFRow row = sheet.getRow(i);
            for(int j=0; j<columnCount;j++) {
                XSSFCell cell = row.getCell(j);
                data[i - 1][j] = cell.getStringCellValue();
                System.out.print(cell.getStringCellValue());
            }
            System.out.println();



            }
        }




        //workbook.close();

    }

