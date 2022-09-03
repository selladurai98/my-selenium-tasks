package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon1 {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();

	
	WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
	Actions a = new Actions(driver);
	a.moveToElement(prime).perform();
	
	Thread.sleep(4000);
	WebElement fast = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
	fast.click();
	
	
	}}
