package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.cleartrip.com/trains");
	driver.manage().window().maximize();
	Thread.sleep(2000); 
	WebElement from= driver.findElement(By.name("from_station"));
	from.sendKeys("Vellore Town (VT)");
	WebElement  to = driver .findElement(By.name("to_station"));
	to.sendKeys("Chennai Central (MAS)");
	WebElement  pass = driver.findElement(By.id("trainClass"));
	pass.sendKeys("Sleeper(SL)");
   WebElement date= driver.findElement(By.id("dpt_date"));
    date.sendKeys("02/06/2022");
   WebElement adults= driver.findElement(By.name("adults"));
   adults.sendKeys("2");
   WebElement child = driver.findElement(By.name("children"));
    child.sendKeys("1");
  WebElement male= driver.findElement(By.name("male_seniors"));
   male.sendKeys("1");
   WebElement female= driver.findElement(By.name("female_seniors"));
   female.sendKeys("1");
   WebElement searchBtn= driver.findElement(By.id("trainFormButton"));
   searchBtn.click();
	}}