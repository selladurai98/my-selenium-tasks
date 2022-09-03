package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchInstagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/?hl=en");

	driver.manage().window().maximize();
	Thread.sleep(4000); 
	WebElement   userTxt = driver.findElement(By.name("username"));
	userTxt.sendKeys("durai");
	
	WebElement passTxt = driver.findElement(By.name("password"));
			passTxt.sendKeys("1817");
	

	} 
}
