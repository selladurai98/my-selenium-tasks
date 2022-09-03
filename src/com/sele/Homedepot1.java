package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Homedepot1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.homedepot.com/");
	driver.manage().window().maximize();

	WebElement dept = driver.findElement(By.xpath("//a[text()='All Departments']"));
	Actions a = new Actions(driver);
	a.moveToElement(dept).perform();
	
	WebElement paint = driver.findElement(By.xpath("(//a[text()='Paint'])[1]"));
	a.moveToElement(paint).perform();
	
	WebElement interior = driver.findElement(By.xpath("(//a[text()='Interior Paint'])[1]"));
	a.moveToElement(interior).perform();
	
	WebElement ceiling= driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
	a.moveToElement(ceiling).perform();
	ceiling.click();
	
}}
