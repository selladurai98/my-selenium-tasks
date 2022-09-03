package com.sele;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart4 {
	public static void main(String[] args) throws Exception {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");

	driver.manage().window().maximize();
	Thread.sleep(2000); 
	
	WebElement close = driver.findElement(By.xpath("//button[text()='✕']"));
	close.click();
	
	WebElement toy = driver.findElement(By.xpath("//div[text()='Beauty, Toys & More']"));
	Actions a = new Actions(driver);
	a.moveToElement(toy).perform();
	
	
	TakesScreenshot tk = (TakesScreenshot)driver;
	File source = tk.getScreenshotAs(OutputType.FILE);
	File target = new File("C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\screenshot\\flip1.png");
	FileUtils.copyFile(source,target);
	
	
}}
