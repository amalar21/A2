package projectfac01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Projectfac1 {
public static void main(String[] args) {
	

	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("Amala");	
	driver.findElement(By.id("pass")).sendKeys("Amala");	
	driver.findElement(By.name("login")).click();	
}}


