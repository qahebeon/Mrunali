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
		public static void login() throws IOException, InterruptedException{
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
			driver.manage().window().maximize();
		}
public static void stage1() throws InterruptedException {
	driver.findElement(By.xpath("(//div[@id='mySidenav'])/li[1]")).click();
	driver.findElement(By.xpath("//button[@id='ContentPlaceHolder1_btnProceed']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body[@id='kids-section']/form[@id='form1']/section[@id='main_content']/div[@class='container-fluid margin-l-r']/div[@class='row']/div[@id='right-layout']/div[@id='page-content']/div[@id='tdNestedPageContent']/div[@class='panel panel-primary']/div[@id='description']/div[2]/span[1]")).click();
}
public static void nextbutton() throws InterruptedException {
     driver.findElement(By.xpath("//div[@class='col-lg-6 next-exam-btn']//a[@id='btnPrev']")).click();
     Thread.sleep(1000);
}
public static void executebutton(String xpath) throws InterruptedException {
	List<WebElement>buttons=driver.findElements(By.xpath(xpath));
	int size=buttons.size();
	System.out.println("size " + size);
	for(int i=0;i<size;i++) {
		buttons.get(i).click();
		Thread.sleep(2000);
	}
}
public static void output(String xpath) {
List<WebElement>outputs=driver.findElements(By.xpath(xpath));
int size2=outputs.size();
for(int i=0;i<size2;i++) {
	String s=outputs.get(i).getText();
	System.out.println(s);
}
}
public static void scrolldown() {
     JavascriptExecutor jse = (JavascriptExecutor)driver;
     jse.executeScript("window.scrollBy(0,600);");
}
public static void cc() {
	 WebElement iframelement =driver.findElement(By.xpath("//iframe[@class='mySlides2 reload-class']"));
     driver.switchTo().frame(iframelement);
     System.out.println("page is switched to iframe");
}
public static void taketest1() throws InterruptedException {
 driver.findElement(By.xpath("//div[@id='flip999200']//div[@class='row']//div[@class='col-md-2 col-sm-2 col-xs-2']//p[@class='exam-date-level']//a[@class='btnTest']")).click();
 Thread.sleep(2000);
 driver.switchTo().defaultContent();
 WebElement iframe2=driver.findElement(By.xpath("//iframe[@id='CCEmbed']"));
driver.switchTo().frame(iframe2);
}
public static void taketest2() throws InterruptedException {
driver.findElement(By.xpath("//div[@id='flip999201']//div[@class='row']//div[@class='col-md-2 col-sm-2 col-xs-2']//p[@class='exam-date-level']//a[@class='btnTest']")).click();
Thread.sleep(2000);
driver.switchTo().defaultContent();
WebElement iframe2=driver.findElement(By.xpath("//iframe[@id='CCEmbed']"));
driver.switchTo().frame(iframe2);
}
public static void runcode() {
driver.findElement(By.xpath("//div[@id='textareacontainer']//div[@class='textarea']//div[@class='row bottom-save col-md-12']//div[@class='col-md-9 col-sm-9']//button[@id='btnsubmitTryit']")).click();
//driver.findElement(By.xpath("//div[@id='textareacontainer']//div[@class='textarea']//div[@class='row bottom-save col-md-12']//div[@class='col-md-9 col-sm-9']//button[@id='btnsubmitTryit']")).click();
//driver.findElement(By.xpath("//div[@id='textareacontainer']//div[@class='textarea']//div[@class='row bottom-save col-md-12']//div[@class='col-md-9 col-sm-9']//button[@id='btnsubmitTryit']")).click();
//driver.findElement(By.xpath("//div[@id='modal-footer']//button[@id='ccpupop']"));
driver.switchTo().defaultContent();
}
   

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
	  System.setProperty("webdriver.chrome.driver","/home/hebeon/Downloads/chromedriver");
	  driver = new ChromeDriver();
      login();
      stage1();
      nextbutton();
      scrolldown();
      WebElement iframe3=driver.findElement(By.xpath("//embed[@class='mySlides2']"));
  	  driver.switchTo().frame(iframe3);
      executebutton("//body[@class='noselect']//div[@id='body-content']//div[@class='panel-body content-page-control']//div[@id=8]//div[@class='assignment-div']//div[@class='pull-right']//button[@class='button_medium1']");  
      executebutton("//body[@class='noselect']//div[@id='body-content']//div[@class='panel-body content-page-control']//div[@id='Div2']//div[@class='assignment-div']//div[@class='pull-right']//button[@class='button_medium1']");
      output("//body[@class='noselect']//div[@id='body-content']//div[@class='panel-body content-page-control']//div[@id=8]//div[@class='assignment-div']//div[@class='col-md-12']//div[@class='outputresultbox']");
      output("//body[@class='noselect']//div[@id='body-content']//div[@class='panel-body content-page-control']//div[@id='Div2']//div[@class='assignment-div']//div[@class='col-md-12']//div[@class='outputresultbox']");
//      Thread.sleep(2000);
//      scrolldown();
//      nextbutton();
//      executebutton("//body[@class='noselect']//div[@id='body-content']//div[@class='panel-body content-page-control']//div[@id='5']//div[@class='assignment-div']//div[@class='pull-right']//button[@class='button_medium1']");
//      executebutton("//body[@class='noselect']//div[@id='body-content']//div[@class='panel-body content-page-control']//div[@id='9']//div[@class='assignment-div']//div[@class='pull-right']//button[@class='button_medium1']");
//      output("//body[@class='noselect']//div[@id='body-content']//div[@class='panel-body content-page-control']//div[@id='5']//div[@class='assignment-div']//div[@class='col-md-12']//div[@class='outputresultbox']");
//      output("//body[@class='noselect']//div[@id='body-content']//div[@class='panel-body content-page-control']//div[@id='9']//div[@class='assignment-div']//div[@class='col-md-12']//div[@class='outputresultbox']");
//      
      //       nextbutton();
//       nextbutton();
//       nextbutton();
//       nextbutton();
//       scrolldown();
//       cc();
//       taketest1();
//       scrolldown();
//       runcode();
       
       
	}

}
