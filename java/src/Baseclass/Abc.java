package Baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Abc {
public static WebDriver driver;
public static void login() {
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/hebeon/Downloads/chromedriver");
		driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_j")).sendKeys("veena");
		driver.findElement(By.id("u_0_l")).sendKeys("rajurkar");
		driver.findElement(By.id("u_0_o")).sendKeys("1974747849");
		driver.findElement(By.id("u_0_v")).sendKeys("12..@#@!A");
       new Select(driver.findElement(By.id("day"))).selectByValue("2");
       new Select(driver.findElement(By.id("month"))).selectByValue("2");
       new Select(driver.findElement(By.id("year"))).selectByValue("1990");
       driver.findElement(By.id("u_0_9")).click();
       driver.findElement(By.id("u_0_11")).click();
       //driver.findElement(By.xpath("//a[@id='u_9_2']")).click();
	}

}
