package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	public static void main(String[] args) {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");

	WebElement male = driver.findElement(By.name("radiooptions"));
	male.click();
	String att = male.getAttribute("class");
	System.out.println(att);
	boolean b = att.contains("parse");
	System.out.println(b);

}}
