package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCbank {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/");

	driver.manage().window().maximize();
	Thread.sleep(5000); 

	WebElement   userId = driver.findElement(By.name("fldLoginUserId"));
	userId.sendKeys("durai");

	
	
}}
