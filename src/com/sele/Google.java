package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

public static void main(String[] args) throws InterruptedException {
	System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	
 WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");

driver.manage().window().maximize();
Thread.sleep(3000); 

WebElement   search = driver.findElement(By.name("q"));
search.sendKeys("greens velmurugan");

WebElement   searchbtn = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
searchbtn.click();

WebElement   greens = driver.findElement(By.xpath("//h3[contains(text(),'LinkedIn')]"));
greens.click();


}}