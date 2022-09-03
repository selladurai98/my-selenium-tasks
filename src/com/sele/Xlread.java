package com.sele;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class Xlread {
public static void main(String[] args) throws Exception {
		
		File f = new File("C:\\Users\\selladurai\\Desktop\\name.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(f1);
		 Sheet s = w.createSheet("students");
		Row r = s.createRow(0);
			 Cell c = r.createCell(4);
	c.setCellValue("sella");
	FileOutputStream d = new FileOutputStream(f);
w.write(d);
			.//target/mobiles.xlsx
	}
	
}

}


code for xl project
@Test
public void method6()throws Exception {
	 File f = new File("C:\\Users\\selladurai\\Desktop\\MobileAndTv.xlsx");
FileInputStream f2 = new FileInputStream(f) ;
Workbook w = new XSSFWorkbook(f2);
Sheet s = w.getSheet("flipcart");

for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
 Row r = s.getRow(i);
 Cell c =r.getCell(0);
System.out.println(c);
System.out.println("xl read is done");
}
}}

@Test
public void method6()throws Exception {
	 File f = new File("C:\\Users\\selladurai\\Desktop\\MobileAndTv.xlsx");
FileInputStream f2 = new FileInputStream(f) ;
Workbook w = new XSSFWorkbook(f2);
Sheet s = w.getSheet("flipcart");
for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
 Row r = s.getRow(i);
 Cell c =r.getCell(0);
System.out.println(c);
System.out.println("xl read is done");
}
}}



