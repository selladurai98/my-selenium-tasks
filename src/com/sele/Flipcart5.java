package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000); 
	
	WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','sella')", user);
	
	WebElement pass= driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	js.executeScript("arguments[0].setAttribute('value','123456')", pass);
	
	Thread.sleep(2000);

	WebElement login = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
	js.executeScript("arguments[0].click()",login);
	
}}
