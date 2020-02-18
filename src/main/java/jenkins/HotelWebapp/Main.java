package jenkins.HotelWebapp;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Main {
	
static WebDriver driver ;
	
	static WebDriver choisirNavigateur(ENavigateur nav) {
		switch(nav) {
		case firefox:
			driver = new FirefoxDriver() ;
			return driver;
		case chrome:			
			driver = new ChromeDriver();
			return driver;
		case ie:			
			driver = new InternetExplorerDriver();
			return driver;
		default: return null;
			
		}
		
	}

   
	@FindBy(xpath="//h2[.=text()]")
	WebElement titleh2;
	
	@FindBy(xpath="//h3[.=text()]")
	WebElement titleh3;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit_button;
	
	@FindBy(xpath="//select[@name='ville']")
	WebElement select_city;
	
	@FindBy(xpath="//td[.=\"Tokyo\"]")
	WebElement city_tokyo;
	
}
