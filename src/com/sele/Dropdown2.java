package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {
	
		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("http://output.jsbin.com/osebed/2");
			driver.manage().window().maximize();
			
			Select s =new Select(sel);
			WebElement  sel = driver.findElement(By.xpath("//*[text()='Create New Account']");
			sel.click();
			Thread.sleep(5000);
			
			
}}
