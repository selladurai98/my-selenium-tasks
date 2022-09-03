package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");

	driver.manage().window().maximize();
	Thread.sleep(3000); 
	
	WebElement phone = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
	phone.sendKeys("9095526432");
    WebElement cont = driver.findElement(By.xpath("//div[text()='CONTINUE']"));	
	  cont.click();
	 WebElement cont1 = driver.findElement(By.xpath("(//img[@id='det_img_136028485'])[1]"));	
	  cont1.click();
	
}
}