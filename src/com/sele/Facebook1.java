package com.sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement email = driver.findElement(By.name("email"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','durai')", email);
	
	WebElement pass = driver.findElement(By.name("pass"));	
	js.executeScript("arguments[0].setAttribute('value','12345')", pass);
	
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	js.executeScript("arguments[0].click()",login);
	Thread.sleep(5000);
	WebElement meta = driver.findElement(By.xpath("//*[text()=' Meta © 2022']"));
	Thread.sleep(3000);
	js.executeScript("arguments[0].scrollIntoView(true)",meta);
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	WebElement log =driver.findElement(By.xpath("//*[text()='Log in as SK Durai']"));
	js.executeScript("arguments[0].scrollIntoView(false)",log);
}}
