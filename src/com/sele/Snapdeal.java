package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));	
	Actions a = new Actions(driver);
	a.moveToElement(signin).perform();
	
	WebElement register = driver.findElement(By.xpath("//span[text()='Register']"));	
	register.click();
	WebElement user = driver.findElement(By.id("userName"));	
	user.sendKeys("9095526432");
	WebElement continuebtn = driver.findElement(By.id("checkUser"));	
	continuebtn.click();
	WebElement email = driver.findElement(By.name("j_username"));	
	email.sendKeys("selladurai@gmail.com");
	WebElement name = driver.findElement(By.name("j_name"));	
	name.sendKeys("selladurai");
	WebElement dob = driver.findElement(By.name("j_dob"));	
	dob.sendKeys("07/08/2000");
	WebElement pass = driver.findElement(By.name("j_password"));	
	pass.sendKeys("sella@123");
	WebElement sign= driver.findElement(By.id("j_userSignup"));	
	sign.click();
	
	
	
	
	
	
	
	
}}