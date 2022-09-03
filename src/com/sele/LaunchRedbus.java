package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchRedbus {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
			
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	
	driver.manage().window().maximize();

	WebElement from = driver.findElement(By.id("src"));
	from.sendKeys("chennai");
	WebElement to = driver.findElement(By.id("dest"));
	to.sendKeys("trichy");		
	WebElement date= driver.findElement(By.xpath("//input[@class ='db'])[3]"));
	date.sendKeys("07/06/2022");
	WebElement search = driver.findElement(By.id("search_btn"));
	search.sendKeys("trichy");		
	
}} 		
