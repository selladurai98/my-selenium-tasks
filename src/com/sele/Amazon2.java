package com.sele;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon2{
	

		public static void main(String[] args) throws Exception {
			System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone x");	  
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		  Thread.sleep(3000);
		   driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1])")).click();
	
	
	
	
}}
