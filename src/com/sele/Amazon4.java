package com.sele;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon4 {
	public static void main(String[] args) throws Exception {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone x");	  
 driver.findElement(By.xpath("//input[@type='submit']")).click();
WebElement iphone = driver.findElement(By.xpath("//span[text()='Apple iPhone XR (128GB) - (Product) RED']"));
	Actions a = new Actions(driver);
	a.contextClick().perform();
	Robot c = new Robot();
	c.keyPress(KeyEvent.VK_DOWN);
	c.keyRelease(KeyEvent.VK_DOWN );
	c.keyPress(KeyEvent.VK_ENTER);
	c.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	String s = driver.getWindowHandle(); 
	Set<String> s1 = driver.getWindowHandles();
	for(String x:s1) {
		if
		(!x.equals(s)){
		driver.switchTo().window(x);
		}
	}
		WebElement m = driver.findElement(By.xpath("(//span [text()='42,999'])[5]"));
		String  st = m.getText();
		System.out.println(st);
		
		
					


}}