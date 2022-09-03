package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");

	driver.manage().window().maximize();
	Thread.sleep(5000); 
	 
	driver.findElement(By.xpath("//input[@id= 'search']")).sendKeys("vikram new movie trailer");
	driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[3]")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("(//yt-formatted-string[contains(text(),'Official Trailer')])[4]")).click();
	
	
}}