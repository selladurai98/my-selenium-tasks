package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Homedepot {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.homedepot.com/");
	driver.manage().window().maximize();

	
	WebElement dept = driver.findElement(By.xpath("//a[text()='All Departments']"));
	Actions a = new Actions(driver);
	a.moveToElement(dept).perform();
	
	WebElement heat = driver.findElement(By.xpath("(//a[text()='Heating & Cooling'])[1]"));
	a.moveToElement(heat).perform();
	
	WebElement air = driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
	a.moveToElement(air).perform();
	
	
	Thread.sleep(3000);
	WebElement port = driver.findElement(By.xpath("(//a[@data-type='direct'])[2]"));
	a.moveToElement(port).perform();
	port.click();
}}
