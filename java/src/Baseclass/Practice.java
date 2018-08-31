package Baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static WebDriver driver;

public static void main(String[] args) throws InterruptedException, IOException {
	invokebrowser();
	login();
}

	
public static void invokebrowser() {
	System.setProperty("webdriver.chrome.driver","D:\\selenium dump\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}

public static void login() throws InterruptedException, IOException {
	
	  Properties obj = new Properties(); 
	  FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"/java/dataFile.properties");
	  obj.load(objfile);	
	  //System.getProperty("/java/dataFile.properties");
	//dataFile = new UIMap(workingDir + "\\Resources\\datafile.properties");
	String expval="Welcome - PWB [Programming Work Bench]";
	driver.get((obj.getProperty("URL")));
	Thread.sleep(2000);
	String actval=driver.findElement(By.xpath("//*[@id='page']/div/div/div[1]/div/h5")).getText();
	if(expval.equalsIgnoreCase(actval)) {
		System.out.println("Url landing correctly");
	}
	else {
		System.out.println("url is not landing correclty");
	}
		
	driver.findElement(By.id("ContentPlaceHolder1_txtUserName")).sendKeys(obj.getProperty("username"));
	driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys(obj.getProperty("password"));
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter captcha");
	String captcha=sc.nextLine();
	driver.findElement(By.id("ContentPlaceHolder1_CaptchaCodeTextBox")).sendKeys(captcha);
	Thread.sleep(20000);
	driver.findElement(By.id("ContentPlaceHolder1_btnLogin")).click();
}
}


//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		invokebrowser();
//		login("https://pwbdevtest.hebeon.com/login.aspx","hebeonstudent","Hb123!@#");
//
//	}



