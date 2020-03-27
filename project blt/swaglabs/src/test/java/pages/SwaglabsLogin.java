package pages;



import org.openqa.selenium.By;

import swaglabs.WrapperClass;


public class SwaglabsLogin {
	
	public void launchApplication() {
		WrapperClass.openBrowser();
	}
	
	public void enterLoginDetails(String userName, String password) {
		WrapperClass.driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(userName);
		WrapperClass.driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	}
	
	public void clickSubmitButton() {
		WrapperClass.driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	
	public void closeApplication() {
		WrapperClass.closeBrowser();
	}
	
}
