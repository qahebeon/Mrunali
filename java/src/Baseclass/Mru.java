package Baseclass;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mru {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/hebeon/Downloads/chromedriver");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://qatesting.hebeon.com");
//			
//			String expval="Welcome - PWB [Programming Work Bench]";
//			//driver.get((obj.getProperty("URL")));
//			Thread.sleep(2000);
//			String actval=driver.findElement(By.xpath("//*[@id='page']/div/div/div[1]/div/h5")).getText();
//			if(expval.equalsIgnoreCase(actval)) {
//				System.out.println("Url landing correctly");
//			}
//			else {
//				System.out.println("url is not landing correclty");
//			}
				
			driver.findElement(By.id("ContentPlaceHolder1_txtUserName")).sendKeys("hebeonstudent");
			driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("Hb123!@#");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter captcha");
			String captcha=sc.nextLine();
			driver.findElement(By.id("ContentPlaceHolder1_CaptchaCodeTextBox")).sendKeys(captcha);
			Thread.sleep(20000);
			driver.findElement(By.id("ContentPlaceHolder1_btnLogin")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@id='mySidenav'])/li[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@id='mySidenav'])/li[1]")).click();
		Thread.sleep(2000);
			//driver.findElement(By.xpath("//input[@class='pricing-table-sign-up']")).click();
driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]")).click();
	}

}
