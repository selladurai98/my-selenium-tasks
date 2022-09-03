package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
	driver.get("https://www.adactin.com/HotelApp/");
	driver.manage().window().maximize();
	Thread.sleep(3000); 
	WebElement   user = driver.findElement(By.name("username"));
	user.sendKeys("durai");
	WebElement pass = driver.findElement(By.name("password"));
			pass.sendKeys("1817");
			String att = user.getAttribute("value");
			System.out.println(att);
			 String  att1 = pass.getAttribute("value");
			System.out.println(att1);
		}} 




