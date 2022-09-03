package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Snapdeal1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement search = driver.findElement(By.name("keyword"));	
	search.sendKeys("bluetooth headphones");
	
	Thread.sleep(5000);
	WebElement searchbtn = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
	searchbtn.click();
	
	Thread.sleep(10000);
	WebElement headset =driver.findElement(By.xpath("//img[contains(@title,'Aroma')]"));
			headset.click();
}}
