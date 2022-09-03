package com.sele;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbi {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
	driver.get("https://retail.onlinesbi.com/retail/login.htm");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]")).click();
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Alert a = driver.switchTo().alert();
			a.accept();
}}