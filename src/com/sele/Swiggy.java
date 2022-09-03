package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.swiggy.com/");

	driver.manage().window().maximize();
	Thread.sleep(2000); 
	WebElement sign = driver.findElement(By.xpath("//a[text()='Sign up']"));
	sign.click();
	WebElement mob = driver.findElement(By.name("mobile"));
	mob.sendKeys("9095526432");
	WebElement name = driver.findElement(By.name("name"));
	name.sendKeys("sella");
	WebElement email = driver.findElement(By.name("email"));
	email.sendKeys("selladurai0073@gmail.com");
	WebElement pass = driver.findElement(By.name("password"));
	pass.sendKeys("12345678");
	WebElement cont = driver.findElement (By.xpath("//a[text()='CONTINUE']"));
	cont.click();
	}
}
