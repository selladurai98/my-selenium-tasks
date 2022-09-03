package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000); 

	WebElement   userTxt = driver.findElement(By.xpath("//input[@autofocus='1']"));
	userTxt.sendKeys("durai");
	
	WebElement passTxt = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			passTxt.sendKeys("1817");
	WebElement LoginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
			LoginBtn.click();
			} 
			
	}

 