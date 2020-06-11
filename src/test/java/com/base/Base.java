package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driver;
	public static void Launchbrowser() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\prabhakar\\eclipse-workspace\\AdactinPOM\\Driver\\geckodriver.exe");
		driver =new FirefoxDriver();
		
	}
	public static void Loadurl(String url) {
		
		driver.get(url);
	}
	public static void Fill(WebElement e, String  s1 ) {
		e.sendKeys(s1);

	}
	public static void btnclick(WebElement e) {
		
		e.click();
	}
	public static void SBVT(WebElement e,String test) {
		Select s= new Select(e);
		s.deselectByVisibleText(test);

	}
	public static void SBI(WebElement e,int index) {
		Select s1 =new Select(e);
		s1.selectByIndex(index);
	}
	public static String  getdata(int rowno,int cellno) throws IOException {
		File f = new File("C:\\Users\\prabhakar\\eclipse-workspace\\AddacinCucumber\\Excel\\Login.xlsx");
		FileInputStream st = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(st);
		Sheet s = w.getSheet("Monu");
		Row r = s.getRow(rowno);
		Cell c = r.getCell(cellno);
		int type = c.getCellType();
		String name = null;
		if(type==1)
		{
			name = c.getStringCellValue();
		}
		else if (type==0)
		{
			if(DateUtil.isCellDateFormatted(c));
			Date d = c.getDateCellValue();
			SimpleDateFormat b = new SimpleDateFormat();
			 name = b.format(d);
		}
		else
		{
			double n = c.getNumericCellValue();
			long l = (long)n;
		 name = String.valueOf(l);
			
		}
		
		
		return name;
		
	}

}
