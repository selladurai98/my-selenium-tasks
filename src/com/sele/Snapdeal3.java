package com.sele;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal3 {
	public static void main(String[] args) throws Exception {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	WebElement search = driver.findElement(By.name("keyword"));	
  search.sendKeys("Hp laptop");
    Thread.sleep(5000);
   WebElement searchbtn = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
    searchbtn.click();
   
    WebElement product = driver.findElement(By.className("(//*[@class='product-title '])[1]"));
    product.click();
    
    
	TakesScreenshot tk = (TakesScreenshot)driver;
	File source = tk.getScreenshotAs(OutputType.FILE);
	File target = new File("C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\screenshot\\snap.png");
	FileUtils.copyFile(source,target);
	
}}