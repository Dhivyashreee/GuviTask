package task13;

import java.io.*;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel
{
    public static void main(String[] args) throws IOException
    {
        //creating an instance of Workbook class
        Workbook wb = new XSSFWorkbook();
        //creates an excel file at the specified location
        OutputStream fileOut = new FileOutputStream("C:\\Users\\maheshwari\\IdeaProjects\\demo-maven\\src\\main\\resources\\Task.xlsx");

        System.out.println("Excel File has been created successfully.");
        wb.write(fileOut);
    }
}

