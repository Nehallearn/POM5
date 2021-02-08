package com.yus.utils;

import com.yus.constants.FrameworkConstants;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class ExcelReader {
    private ExcelReader()
    {

    }


    public static Object[][] getExceDataintwodObjects(String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(FrameworkConstants.getEXCELFILEPATH());
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        int rowNum = sheet.getLastRowNum();
        int colNum = sheet.getRow(0).getLastCellNum();
        Object[][] data = new Object[rowNum][colNum];
        for(int i=1;i<=rowNum;i++)
        {
            for(int j=0;j<colNum;j++)
            {
                data[i-1][j]= sheet.getRow(i).getCell(j).getStringCellValue();
            }
        }
        return data;

    }

    public static Object[] getExcelDatawithMapObjects(String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(FrameworkConstants.getEXCELFILEPATH());
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        int rowNum = sheet.getLastRowNum();
        int colNum = sheet.getRow(0).getLastCellNum();
        Object[] data = new Object[rowNum];
        Map<String,String> map;
        for(int i=1;i<=rowNum;i++)
        {
            map = new HashMap<>();
            for(int j=0;j<colNum;j++)
            {
                String key = sheet.getRow(0).getCell(j).getStringCellValue();
                String value = sheet.getRow(i).getCell(j).getStringCellValue();
                map.put(key,value);
                data[i-1] = map;
            }
        }
        return data;

    }
}
