package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
	driver.get("https://paytm.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement eb = driver.findElement(By.xpath("//div[text()='Electricity']"));
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollintoview(false)",eb);
	
	eb.click();
}}
