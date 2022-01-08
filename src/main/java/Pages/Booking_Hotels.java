package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;

public class Booking_Hotels extends TestBase {
	//WebElement bookingField;
	
	//@FindBy(xpath ="//*[@id=\"0\"]/div[4]/div[3]/div[1]")
	//WebElement selectRoom;
	
	//@FindBy(xpath = "//*[@id=\"roomHotel0\"]/div[1]/div/div[3]/div[2]")
	//WebElement bookRoom;
	
	//@FindBy(xpath= "//*[@id=\"0\"]/div[3]/p[1]")
	//WebElement Hotelname;
	
	//@FindBy(xpath = "//*[@id=\"roomHotel0\"]/div")
	
	
	public Booking_Hotels() {
		PageFactory.initElements(driver, this);
	}
	
	public void validateBooking(String selectRoom, String bookRoom)
	{
		/*WebElement bookingField = driver.findElement(By.xpath("//*[@id=\"0\"]/div[3]/div[3]/div[1]"));
		bookingField.click();
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"roomHotel0\"]/div[1]/div/div[3]/div[2]"))).click();
		WebElement bookRoom1 = driver.findElement(By.xpath("//*[@id=\"roomHotel0\"]/div[1]/div/div[3]/div[2]"));
		bookRoom1.click();*/
	
		
		
		
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
}
