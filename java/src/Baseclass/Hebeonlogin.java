package Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hebeonlogin {
	public static WebDriver driver;
public static void Invoke() {
	
//		
}
public static void properties() throws IOException, InterruptedException {
	FileInputStream fis = new FileInputStream("/home/hebeon/eclipse-workspace/java/config/config.properties");
	Properties prop = new Properties();
	prop.load(fis);
	System.setProperty("webdriver.chrome.driver","/home/hebeon/Downloads/chromedriver");
	driver= new ChromeDriver();
	driver.get("https://qatesting.hebeon.com");
	driver.findElement(By.id("ContentPlaceHolder1_txtUserName")).sendKeys(prop.getProperty("username"));
	driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys(prop.getProperty("password"));
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter captcha");
	String captcha=sc.nextLine();
	driver.findElement(By.id("ContentPlaceHolder1_CaptchaCodeTextBox")).sendKeys(captcha);
	Thread.sleep(20000);
	driver.findElement(By.id("ContentPlaceHolder1_btnLogin")).click();
	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//div[@id='mySidenav'])/li[3]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//div[@id='mySidenav'])/li[1]")).click();
//Thread.sleep(2000);
}
//	public static void main(String[] args) throws IOException, InterruptedException {
//		// TODO Auto-generated method stub
//		properties();
//
//	}

}
