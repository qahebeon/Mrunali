package Baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clang  {
	public static WebDriver driver;
	//public static WebDriver driver;
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
	driver.findElement(By.xpath("(//div[@id='mySidenav'])/li[1]")).click();
	driver.findElement(By.xpath("//button[@id='ContentPlaceHolder1_btnProceed']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body[@id='kids-section']/form[@id='form1']/section[@id='main_content']/div[@class='container-fluid margin-l-r']/div[@class='row']/div[@id='right-layout']/div[@id='page-content']/div[@id='tdNestedPageContent']/div[@class='panel panel-primary']/div[@id='description']/div[2]/span[1]")).click();
     driver.findElement(By.xpath("//a[@id='btnPrev']")).click();
     driver.findElement(By.xpath("//a[@id='btnPrev']")).click();
     driver.findElement(By.xpath("//a[@id='btnPrev']")).click();
     driver.findElement(By.xpath("//a[@id='btnPrev']")).click();
     driver.findElement(By.xpath("//a[@id='btnPrev']")).click();
     driver.findElement(By.xpath("//a[@id='btnPrev']")).click();
     Thread.sleep(1000);
     JavascriptExecutor jse = (JavascriptExecutor)driver;
     jse.executeScript("window.scrollBy(0,250);");
     WebElement iframelement =driver.findElement(By.xpath("//iframe[@class='mySlides2 reload-class']"));
     driver.switchTo().frame(iframelement);
     System.out.println("page is switched to iframe");
 driver.findElement(By.xpath("//div[@id='flip999200']//div[@class='row']//div[@class='col-md-2 col-sm-2 col-xs-2']//p[@class='exam-date-level']")).click();
    // Thread.sleep(2000);
     //driver.findElement(By.xpath("//div[@id='8']//div[@class='assignment-div']//div[@class='pull-right']//button[@class='button_medium1']")).click();
//     int size=buttons.size();
//     System.out.println("size of buttons" + size);
//     for(int i=0;i<size-1;i++) {
//    	 buttons.get(i).click();
//    	 Thread.sleep(1000);
    	// driver.findElement(By.xpath())
     }
	//	driver.findElement(By.xpath("//a[@id='A3']")).click();
//	driver.findElement(By.xpath("//a[@id='A3']")).click();

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/hebeon/Downloads/chromedriver");
	     driver = new ChromeDriver();
       invoke();
       stage1();
	}

}
