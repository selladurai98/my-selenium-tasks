package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAccount {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");

	driver.manage().window().maximize();
	Thread.sleep(2000); 
	
	WebElement first = driver.findElement(By.id("firstName"));
	first.sendKeys("chella");
	WebElement last = driver.findElement(By.id("lastName"));
	last.sendKeys("durai");
     WebElement email = driver.findElement(By.id("username"));
    email.sendKeys("selladurai434007");
    WebElement pass = driver.findElement(By.name("Passwd"));
	pass.sendKeys("sella12345");
	WebElement name = driver.findElement(By.name("ConfirmPasswd"));
	name.sendKeys("sella12345");
	WebElement next = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
	next.click();
	
	}}