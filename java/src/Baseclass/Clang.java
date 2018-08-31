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

public class Clang extends Hebeonlogin {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
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
		driver.findElement(By.xpath("(//div[@id='mySidenav'])/li[1]")).click();
		driver.findElement(By.xpath("//button[@id='ContentPlaceHolder1_btnProceed']")).click();
		//driver.findElement(By.xpath("((//div[@class='pr0 '])/a[@id='https://player.vimeo.com/video/238185061'])/div[@class='paly-icon']")).click();
		driver.findElement(By.xpath("(//div[@class='pull-right'])[4]")).click();
driver.findElement(By.xpath("//a[@id='btnPrev']")).click();
WebElement obj=driver.findElement(By.xpath("(//button[@class='button_medium1'])[0]"));
obj.click();
boolean validation=driver.getPageSource().contains("Program Executed!");
if(validation==true) {
	System.out.println("Test passed");
}else { 
	System.out.println("Test Failed");
}
//try
//{
//	Assert.assertEquals("Program Executed!","Program Executed!");
// // Assert.IsTrue(verifyTextPresent("Selenium Wiki"));
//  //Console.WriteLine("Selenium Wiki test is present on the home page");
//}
//catch (Exception)
//{
//  //Console.WriteLine("Selenium Wiki test is not present on the home page");
//}
////if(("Program Executed!")) {
////	System.out.println("Test passed");
//}

	


}}
