package com.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {
	
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
	
 WebDriver driver = new ChromeDriver();
 driver.get("https://www.facebook.com/");
 driver.manage().window().maximize();
	WebElement email = driver.findElement(By.name("email"));	
	email.sendKeys("selladurai0073@gmail.com");
 
 Thread.sleep(3000);
 Actions a = new Actions(driver);
 a.doubleClick(email).contextClick().build().perform();
 Robot r = new Robot();
for (int i = 0; i <2; i++) {
	r.keyPress(KeyEvent.VK_DOWN );
	r.keyRelease(KeyEvent.VK_DOWN);
}
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(3000);
r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);
Thread.sleep(3000);
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_V);

Thread.sleep(6000);

driver.findElement(By.name("login")).click();
TakesScreenshot tk = (TakesScreenshot)driver;
tk.getScreenshotAs(OutputType.FILE);
File source = tk.getScreenshotAs(OutputType.FILE);
File target = new File("C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\screenshot\\ flip.png);");
FileUtils.copyFile(source,target);

 
 
}
}



















