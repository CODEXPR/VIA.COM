package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;



public class LoginPage extends TestBase{
	@FindBy(id = "loginIdText")
	WebElement usernameField;
	
	@FindBy(id = "passwordText")
	WebElement passwordField;
	
	@FindBy(id = "loginValidate")
	WebElement loginButton;
	
	@FindBy(id = "SignIn")
	WebElement SigInbtn;
	
	@FindBy(id = "destination")
	WebElement destinationField;
	
	@FindBy(id = "destination")
	WebElement destinationField1;
	
	@FindBy(xpath = "///*[@id=\"0\"]/div[4]/div[3]/div[1]")
	WebElement destinationField2;
	
	@FindBy(className="done")
	WebElement donebtn;
	
	@FindBy(xpath= "//div[@class=\"search-hotel u_vertAlignMiddle u_floatR\"]")
	WebElement searchbtn;
	
	@FindBy(className="searchName")
	WebElement snamebtn;
	
	@FindBy(xpath="//*[@id=\"destination\"]")
	WebElement dest;
	@FindBy(xpath="//*[@id=\"destination\"]")
	WebElement down;
	@FindBy(xpath="/html/body/ul/li[1]")
	WebElement enter;
	
	
	public  LoginPage() {
		PageFactory.initElements(driver, this);
		
		
		/*destinationField2.sendKeys("Mumbai");
		dest.sendKeys("mumbai");
		
		enter.sendKeys(Keys.ARROW_DOWN);
		//enter.sendKeys(Keys.ARROW_DOWN);
		//enter.sendKeys(Keys.ARROW_DOWN);
		//enter.sendKeys(Keys.ARROW_DOWN);
		enter.sendKeys(Keys.ENTER);
		//searchbtn.click();
		//destinationField2.sendKeys(Keys.ARROW_DOWN);
		//destinationField2.sendKeys(Keys.ENTER);
		searchbtn.click();*/
		//WebElement from=driver.findElement(By.xpath("//*[@id=\"destination\"]"));
		//from.click();
		/*dest.sendKeys("Mumbai");
		enter.sendKeys(Keys.ARROW_DOWN);
		enter.sendKeys(Keys.ENTER);*/
		
		//WebElement from = driver.findElement(By.xpath("//*[@id=\"destination\"]"));
		/*from.clear();
		from.sendKeys("mumbai");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/ul/li[1]")));
		//driver.findElement(By.xpath("html/body/div[9]/ul/li")).click();
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/ul/li[1]")));
		
		searchbtn.click();
				
		
		
		destinationField2.click();
		
		/*SigInbtn.click();
		usernameField.sendKeys("piyuyadav528@gmail.com");
		passwordField.sendKeys("Priy@231999");
		loginButton.click();
		//destinationField.click();
		//searchField.click();
		destinationField.sendKeys("Mumbai,Maharashtra,India");
		dropDown.click();
		searchField.click();

		searchbtn.click();*/
		
		/*SigInbtn.click();
		usernameField.sendKeys("piyuyadav528@gmail.com");
		passwordField.sendKeys("Priy@231999");
		loginButton.click();
		
		destinationField1.sendKeys("mumbai");
		destinationField2.click();*/
	
		//searchbtn.click();
		
		
	}
	
	
	public String validateTitle() {

		String title = driver.getTitle();
		return title;
	}
	
	
	
	public DashboardPage  validateLogin(String username, String password){
		
		SigInbtn.click();
		usernameField.sendKeys("piyuyadav528@gmail.com");
		passwordField.sendKeys("Priy@231999");
		loginButton.click();
		
		return new DashboardPage();
		}
	
	}