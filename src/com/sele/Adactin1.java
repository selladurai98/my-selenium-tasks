package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
	driver.get("https://www.adactin.com/HotelApp/");
	driver.manage().window().maximize();
	Thread.sleep(3000); 

	WebElement user= driver.findElement(By.name("username"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','selladurai')", user);
	
	WebElement pass = driver.findElement(By.name("password"));	
	js.executeScript("arguments[0].setAttribute('value','12345678')", pass);
	
	WebElement login = driver.findElement(By.name("login"));
	js.executeScript("arguments[0].click()",login);
}}

