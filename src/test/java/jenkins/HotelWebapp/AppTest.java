package jenkins.HotelWebapp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




public class AppTest {

	WebDriver driver; 
	private String browser="Chrome";	
	private String IP="http://192.168.102.219:9999/";
	
	Main main = PageFactory.initElements(driver, Main.class);

	@Before
	public void SetUp() throws InterruptedException {

		if(browser.equals("Chrome"))	{
			driver = new ChromeDriver();
			System.setProperty("webdriver.chromedriver", "/HotelWebapp/src/drivers/chromedriver.exe");
		}
		if(browser.equals("Firefox"))	{
			driver = new FirefoxDriver();
			System.setProperty("webdriver.geckodriver", "/HotelWebapp/src/drivers/geckodriver.exe");
		}			
	}	

	@Test	
	public void Connexion () throws InterruptedException, IOException {

		
		Main main = PageFactory.initElements(driver, Main.class);
		String url = (IP +"HotelWebapp/");
		System.out.println("connexion :" + url);		
		driver.get(IP +"HotelWebapp/");			

		Assert.assertEquals("Application Tutoriel pour la base de données des hotels" , main.titleh2.getText());		
		Assert.assertEquals("Choisissez une destination" , main.titleh3.getText());
	
	
	
		Select cities = new Select (main.select_city);
		cities.selectByVisibleText("Tokyo");
		main.submit_button.click();
		Assert.assertEquals("Tokyo" , main.city_tokyo.getText());
		
	}
}
