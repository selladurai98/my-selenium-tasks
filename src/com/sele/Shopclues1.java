package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopclues1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.shopclues.com/wholesale.html");
	
	driver.manage().window().maximize();
	Thread.sleep(3000); 

	WebElement sports = driver.findElement(By.xpath("//a[text()='Sports & More']"));
	Actions a = new Actions(driver);
	a.moveToElement(sports).perform();
	
	WebElement weight=driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
	a.moveToElement(weight).perform();
	weight.click();
	
	
}}
