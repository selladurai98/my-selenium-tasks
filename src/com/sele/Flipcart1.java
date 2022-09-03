package com.sele;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart1 {
	public static void main(String[] args) throws Exception {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");

	driver.manage().window().maximize();
	Thread.sleep(4000); 
	
	WebElement close = driver.findElement(By.xpath("//button[text()='✕']"));
	close.click();
	
	WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));	
	Actions a = new Actions(driver);
	a.moveToElement(fashion).perform();
	
	WebElement men = driver.findElement(By.xpath("//*[text()='Men Footwear']"));
    a.moveToElement(men).perform();
    men.click();
 
    JavascriptExecutor js = (JavascriptExecutor)driver;
    
	TakesScreenshot tk = (TakesScreenshot)driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\screenshot\\flipcart.jpg");
		FileUtils.copyFile(source,target);

	 
  
	
    
	}}
    
    
    
//a[contains(text(),'Dresses')])[3]