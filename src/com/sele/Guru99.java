package com.sele;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Guru99 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement   source1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	WebElement   target1 = driver.findElement(By.xpath("//ol[@id='bank']/li"));
	Actions a = new Actions(driver);
	a.dragAndDrop(source1, target1).perform();
	
	WebElement source2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
	WebElement   target2 = driver.findElement(By.xpath("//ol[@id='amt7']/li"));
	a.dragAndDrop(source2,target2).perform();
		
	WebElement source3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
	WebElement   target3 = driver.findElement(By.xpath("//ol[@id='loan']/li"));
	a.dragAndDrop(source3,target3).perform();
		
	
	WebElement source4 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
	WebElement   target4 = driver.findElement(By.xpath("//ol[@id='amt8']/li"));
	a.dragAndDrop(source4,target4).perform();
	
	WebElement perfectbtn = driver.findElement(By.xpath("//a[text()='Perfect!']"));
   String text =perfectbtn.getText();
   System.out.println(text);
   String s = "Perfect!";
   System.out.println(s);
   boolean b = s.equals(text);
   System.out.println(b);
   
	}}


