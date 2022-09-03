package com.sele;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000); 
	WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	user.sendKeys("selldurai0073gmail.com");
	WebElement pass= driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	pass.sendKeys("9095526432");
	
	String att = user.getAttribute("value");
	System.out.println(att);
	String att1 = pass.getAttribute("value");
	System.out.println(att1);
	
}}
