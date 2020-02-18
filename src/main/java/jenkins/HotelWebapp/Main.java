package jenkins.HotelWebapp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Main {
   
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
