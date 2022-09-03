package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lakshmivilas {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html");

	driver.manage().window().maximize();
	Thread.sleep(2000); 
	
	WebElement user = driver.findElement(By.id("navbar_username"));
	user.sendKeys("sella");
	
	WebElement pass = driver.findElement(By.name("vb_login_password"));
	pass.sendKeys("12345");
	 
	WebElement checkbox = driver.findElement (By.name("cookieuser"));
	checkbox.click();
	WebElement login = driver.findElement (By.xpath("(//input[@type = 'submit'])[1]"));
	login.click();
}}
