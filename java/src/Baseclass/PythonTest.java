package Baseclass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PythonTest extends Practice {
	public static WebDriver driver;
	public static void test() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='mySidenav'])//li[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='ContentPlaceHolder1_btnProceed']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnNextToExam']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='rdbOptionB0']")).click();
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokebrowser();
		//login("https://pwbdevtest.hebeon.com/StudentHome.aspx","ctest2","ctest");
		test();

	}

}


