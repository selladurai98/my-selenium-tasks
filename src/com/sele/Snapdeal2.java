package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	
	WebElement women = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));	
	Actions a = new Actions(driver);
	a.moveToElement(women).perform();
	
	WebElement heals = driver.findElement(By.xpath("//span[text()='Heels']"));	
	a.moveToElement(heals).perform();
	heals.click();
}}
