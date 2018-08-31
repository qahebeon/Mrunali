package Baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Propertiesk {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;	
		Properties obj = new Properties();					
	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"/java/dataFile.properties");									
	    obj.load(objfile);
	    System.setProperty("webdriver.chrome.driver","D:\\selenium dump\\chromedriver.exe");					
	    driver = new ChromeDriver();					
	    driver.get(obj.getProperty("url"));					
	    driver.manage().window().maximize();			
	// Load the properties File		
//	    Properties obj = new Properties();					
//	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"/java/dataFile.properties");									
//	    obj.load(objfile);					
//	    
	// Nagigate to link Mobile Testing and Back		
	    			
	// Enter Data into Form		
	    
	}

	

}
