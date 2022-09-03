package com.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		 Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
	WebElement table = driver.findElement(By.tagName("table"));

	driver.findElement(By.xpath("//td[@class='next']")).click(); 
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		for (int i = 1; i < tRows.size(); i++) {
		WebElement row = tRows.get(i);
		 List <WebElement> tData = row.findElements(By.tagName("td"));
		 for (int j = 0; j <tData.size(); j++) {
			WebElement Data =  tData.get(j);
		  String s = Data.getText();
		  if (s.equals("25")) {
			System.out.println(s);
		Data.click();
		}
		
			
		}
		}
		
		
		
		
}}
