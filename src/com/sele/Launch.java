package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");

	WebElement   userTxt = driver.findElement(By.id("email"));
	String input = "welcome to java";
	userTxt.sendKeys(input);
	String att = userTxt.getAttribute("value");
	System.out.println(att);

    boolean b = att.equals(input);
    System.out.println(b);
   
}}
