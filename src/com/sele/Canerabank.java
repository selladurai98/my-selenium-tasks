package com.sele;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Canerabank {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
	driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	 Alert a = driver.switchTo().alert();
       a.accept();
       Thread.sleep(3000);

	WebElement sign= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	sign.sendKeys("sella");
	driver.switchTo().defaultContent();
	WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])"));
pass.sendKeys("durai");

WebElement cap = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
cap.click();
	}}
