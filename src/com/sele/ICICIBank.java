package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICIBank {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	driver.manage().window().maximize();
	Thread.sleep(5000); 
	WebElement   userId = driver.findElement(By.name("DUMMY1"));
	userId.click();
	WebElement  inputTxt = driver .findElement(By.xpath("(//input[@type='password'])[4]"));
	inputTxt.sendKeys("sella");
	WebElement  pass = driver.findElement(By.xpath("(//input[@type='Submit'])[1]"));
	pass.sendKeys("12345");
	} 
}
