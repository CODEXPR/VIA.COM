package searching;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;


public class searchhotels extends TestBase {
	

	@FindBy(id = "destination")
	WebElement destinationField;
	
	@FindBy(className="done")
	WebElement donebtn;
	
	@FindBy(className="search-hotel u_vertAlignMiddle u_floatR")
	WebElement searchbtn;
	
	@FindBy(className="searchName")
	WebElement snamebtn;
	
	
	public void searchhotels() {
		PageFactory.initElements(driver, this);
		destinationField.sendKeys("Navi Mumbai,Maharashtra,India");
		snamebtn.click();
		searchbtn.click();
		
		
		
		
		
		
		
	}
	

}
