package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homedepot2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.homedepot.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='headerSearch']")).sendKeys("ceiling fans");
driver.findElement(By.xpath("(//*[@id='headerSearchButton'])[1]")).click();
driver.findElement(By.xpath("(//*[text()='Ceiling Fans With Lights'])[1]")).click();

}}
