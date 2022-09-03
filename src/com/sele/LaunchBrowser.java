package com.sele;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchBrowser {
public static void main(String[] args) throws InterruptedException {
	System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
 
WebDriver driver = new ChromeDriver();
driver.get("https://www.lvbankonline.in/index.html?module=login");

driver.manage().window().maximize();
Thread.sleep(3000); 
Actions a= new Actions(driver);
WebElement   userTxt = driver.findElement(By.xpath("//a[text()='Forgot Password']"));
		 a.contextClick(userTxt);

	
		 
}
}


