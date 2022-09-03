package com.sele;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfcbank1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sella");
		WebElement   CONT = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
	CONT.click();
	
	driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	

	 driver.findElement(By.xpath("//button[@id='elemA11']")).click();
	 driver.findElement(By.xpath("//button[@id='elemA11']")).click();
	 driver.findElement(By.xpath("//button[@id='elemA11']")).click();
	 driver.findElement(By.xpath("//button[@id='elemA11']")).click();
	 driver.findElement(By.xpath("//button[@id='elemA11']")).click();
	 
	 driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]")).click();
	 
}}