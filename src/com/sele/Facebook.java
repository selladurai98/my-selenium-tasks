package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement email = driver.findElement(By.name("email"));	
	email.sendKeys("selladurai0073@gmail.com");

	WebElement pass = driver.findElement(By.name("pass"));	
	pass.sendKeys("selladurai0073");
	
	String att = email.getAttribute("value");
	System.out.println(att);
	String att1 = pass.getAttribute("value");
	System.out.println(att1);
	
	}}	

