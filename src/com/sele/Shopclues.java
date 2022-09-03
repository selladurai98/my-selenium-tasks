package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopclues {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.shopclues.com/wholesale.html");
	
	driver.manage().window().maximize();
	Thread.sleep(3000); 

	WebElement   userTxt = driver.findElement(By.id("autocomplete"));
	userTxt.sendKeys("watches for men");
	WebElement search = driver.findElement(By.xpath("//a[text()='Search']"));
	search.click();
	 Thread.sleep(3000);
  WebElement watch = driver.findElement(By.xpath("(//img[@id='det_img_136028485'])[1]"));
	watch.click();
}}
