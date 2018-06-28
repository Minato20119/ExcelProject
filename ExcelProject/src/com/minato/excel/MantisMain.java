/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minato.excel;

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
public class MantisMain {

    public static void main(String[] args) throws IOException {
        System.out.println("Create file excel");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Mantis_Info");
        int rowNum = 0;

        List<Mantis> listMantis = getValue();

        for (Mantis mantis : listMantis) {
            Row row = sheet.createRow(rowNum++);

            Cell cell = row.createCell(0);
            cell.setCellValue(mantis.getNone());

            Cell cell1 = row.createCell(1);
            cell1.setCellValue(mantis.getReporter());

            Cell cell2 = row.createCell(2);
            cell2.setCellValue(mantis.getP());

            Cell cell3 = row.createCell(3);
            cell3.setCellValue(mantis.getId());

            Cell cell4 = row.createCell(4);
            cell4.setCellValue(mantis.getSeverity());

            Cell cell5 = row.createCell(5);
            cell5.setCellValue(mantis.getAttachmentCount());

            Cell cell6 = row.createCell(6);
            cell6.setCellValue(mantis.getCategory());

            Cell cell7 = row.createCell(7);
            cell7.setCellValue(mantis.getSummary());

            Cell cell8 = row.createCell(8);
            cell8.setCellValue(mantis.getAsignedTo());

            Cell cell9 = row.createCell(9);
            cell9.setCellValue(mantis.getTargetVersion());

            Cell cell10 = row.createCell(10);
            cell10.setCellValue(mantis.getFixedInVersion());

            Cell cell11 = row.createCell(11);
            cell11.setCellValue(mantis.getIncludeInReleaseNote());

            Cell cell12 = row.createCell(12);
            cell12.setCellValue(mantis.getUpdated());

            Cell cell13 = row.createCell(13);
            cell13.setCellValue(mantis.getCustomers());

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

    public static List<Mantis> getValue() throws IOException {

        List<Mantis> mantises = new ArrayList<>();

        File input = new File("C:\\Users\\Minato\\Desktop\\View Issues - MantisBT.html");

        Document doc = Jsoup.parse(input, "UTF-8");

        Elements rows = doc.select("tr");

        System.out.println("rows: " + rows.size());

        for (Element row : rows) {

            Elements columns = row.select("td");

            System.out.println("column: " + columns.size());

            List<String> list = new ArrayList<>();

            for (Element column : columns) {

                list.add(column.text());

                String value = String.format("%-130s", column.text());
                System.out.print(value);

            }
            System.out.println();
            if (list.size() > 13) {
                mantises.add(new Mantis("", list.get(1), "", list.get(3), list.get(4), list.get(5), list.get(6), list.get(7), list.get(8), list.get(9), list.get(10), list.get(11), list.get(12), list.get(13)));
            }
        }

        return mantises;
    }
}
