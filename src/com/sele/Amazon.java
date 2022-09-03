package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");

	driver.manage().window().maximize();
	Thread.sleep(1000); 
	WebElement signin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	signin.click();
	WebElement number = driver.findElement(By.name("email"));
	number.sendKeys("9095526432");
	WebElement cont = driver.findElement(By.id("continue"));
	cont.click();
	WebElement pass = driver.findElement(By.name("password"));
	pass.sendKeys("amazon");
	
	}}