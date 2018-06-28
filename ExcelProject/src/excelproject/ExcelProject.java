/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Minato
 */
public class ExcelProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Create file excel");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Customer_Info");
        int rowNum = 0;
        Row firstRow = sheet.createRow(rowNum++);
        Cell firstCell = firstRow.createCell(0);
        firstCell.setCellValue("List of Customer");
        
        List<Customer> listOfCustomer = new ArrayList<>();
        listOfCustomer.add(new Customer(1, "Sylvester Stallone", "abc@gmail.com"));
        listOfCustomer.add(new Customer(2, "Tom Cruise", "xyz@yahoo.com"));
        listOfCustomer.add(new Customer(3, "Vin Diesel", "abc@hotmail.com"));
        
        for (Customer customer : listOfCustomer) {
            Row row = sheet.createRow(rowNum++);
            
            
            
            Cell cell1 = row.createCell(0);
            cell1.setCellValue(customer.getId());
            
            Cell cell2 = row.createCell(1);
            cell2.setCellValue(customer.getName());
            
            Cell cell3 = row.createCell(2);
            cell3.setCellValue(customer.getEmail());
        }
        try {
            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Minato\\Desktop\\M.xlsx");
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
        System.out.println("Done");
    }

    public static void getValue() throws IOException {
        File input = new File("C:/Users/Minato/Downloads/Bandwidthd.html");

        Document doc = Jsoup.parse(input, "UTF-8");

        Elements rows = doc.select("tr");

        for (Element row : rows) {

            Elements columns = row.select("td");

            for (Element column : columns) {

//					arrayList.add(column.text());
                String value = String.format("%15s", column.text());
                System.out.print(value);

            }
            System.out.println();

        }
    }
}
