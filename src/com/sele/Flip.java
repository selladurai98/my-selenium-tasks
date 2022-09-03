package com.sele;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip {
	public static void main(String[] args) throws Exception {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000); 
	
	WebElement close = driver.findElement(By.xpath("//button[text()='✕']"));
	close.click();
	WebElement iphone = driver.findElement(By.xpath("//input[@type= 'text']"));
iphone.sendKeys("iphone 13 pro");
WebElement search = driver.findElement(By.xpath("//*[@width='20']"));
search.click();
Thread.sleep(4000);
WebElement iph= driver.findElement(By.xpath("(//*[@class='_4rR01T'])[1]"));
iph.click();

 String par = driver.getWindowHandle();
  Set<String> all = driver.getWindowHandles();
  for (String x : all) {
	if (!x.equals(par)) {
		driver.switchTo().window(x);
	}}
  Thread.sleep(4000);
  WebElement xl = driver.findElement(By.xpath("//*[text()='ADD TO CART']"));
	xl.click();
	Thread.sleep(3000);
	WebElement remove = driver.findElement(By.xpath("//*[text()='Remove']"));
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",remove);
	remove.click();
	driver.findElement(By.xpath("//*[text()='Remove']")).click();
	
	}}
  

