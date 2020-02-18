package jenkins.HotelWebapp;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AppTest {
	
	WebDriver driver;
	private String IP="http://192.168.102.219:9999/";
	Main main = PageFactory.initElements(driver, Main.class);
		
	@Before
	public void setup() {
		driver = Main.choisirNavigateur(ENavigateur.chrome);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test	
	public void Connexion ()  {

		
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
