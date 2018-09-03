package Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ITIS extends Hebeonlogin {
	public static WebDriver driver;
	public static void invoke() throws IOException, InterruptedException{
		FileInputStream fis = new FileInputStream("/home/hebeon/git/repository/java/config/config.properties");
		Properties prop = new Properties();
		prop.load(fis);
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
	}
	public static void stage1() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@id='mySidenav'])/li[3]")).click();
		driver.findElement(By.xpath("//button[@id='ContentPlaceHolder1_btnProceed']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='A3']")).click();
		driver.findElement(By.xpath("//a[@id='A3']")).click();
	}
	public static void stage2() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='right']//ul//li[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='A110']")).click();
		driver.findElement(By.xpath("//a[@id='A110']")).click();
		driver.findElement(By.xpath("//a[@id='A110']")).click();
		driver.findElement(By.xpath("//a[@id='A110']")).click();
		driver.findElement(By.xpath("//a[@id='A110']")).click();
	}
	public static void stage3() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='right']//ul//li[4]")).click();
		Thread.sleep(1000);
		WebElement el=driver.findElement(By.xpath("//a[@class='slidecurrent']"));
		WebElement el1=driver.findElement(By.xpath("//a[@id='btnStage3Slide1']"));
	if(el==el1) {
		System.out.println("test passed");
	}else
	{
		System.out.println("test failed");
	}
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver","/home/hebeon/Downloads/chromedriver");
     driver = new ChromeDriver();
		invoke();
		stage1();
		stage2();
		stage3();
		//driver.findElement(By.xpath("//input[@id='activateNextstage']")).click();
		


}}
