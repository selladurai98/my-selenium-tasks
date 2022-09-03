package com.sele;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart2 {
	public static void main(String[] args) throws Exception {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");

	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	WebElement close = driver.findElement(By.xpath("//button[text()='✕']"));
	close.click();
	
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("Iphone 13pro");
	   
	
	WebElement searchbtn = driver.findElement(By.xpath("//button[@type='submit']"));
	searchbtn.click();
	Thread.sleep(4000);
	
	TakesScreenshot tk = (TakesScreenshot)driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\screenshot\\flip.png");
		FileUtils.copyFile(source,target);
}}
