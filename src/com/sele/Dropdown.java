package com.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
	Thread.sleep(5000);
	
	 WebElement  first = driver.findElement(By.name("firstname"));
	 first.sendKeys("sella");
	 
	Thread.sleep(3000);
	  WebElement  year = driver.findElement(By.xpath("//select[@id ='year']"));
	
	  Thread.sleep(3000);
	 Select s = new Select(year);
	 List<WebElement> li = s.getOptions();
	 
	for (WebElement l : li) {
		
		
  System.out.println(l.getText());
	
	}
	 WebElement month = driver.findElement(By.id("month"));
	 Select s1 = new Select(month);
	   List<WebElement> lii = s1.getOptions();
	   for (WebElement l1 : lii) {
		   System.out.println(l1.getText());
		   Thread.sleep(3000);
		   if (l1.equals("May")) {
		l1.click();
		}
		
	}
	 
	
}
}
