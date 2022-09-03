package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");

	driver.manage().window().maximize();
	Thread.sleep(4000); 
	
	WebElement cont = driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']"));
	cont.click();
	
	WebElement phoneno= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	phoneno.sendKeys("9095526432");
	WebElement login= driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	login.click();
	WebElement pass= driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys("selladurai");
	WebElement clickbtn= driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
			clickbtn.click();
	}}
