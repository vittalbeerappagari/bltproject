package pages;

import org.openqa.selenium.By;

import swaglabs.WrapperClass;


public class SwaglabsAbout extends SwaglabsLogin{
	
	public void launchApplication() {
		WrapperClass.openBrowser();
	}
	
	public void enterLoginDetails() {
		WrapperClass.driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		WrapperClass.driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	}

	public void clickSubmitButton() {
		WrapperClass.driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	public void clickAbout() {
		WrapperClass.driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
		WrapperClass.driver.findElement(By.xpath("//*[@id=\"about_sidebar_link\"]")).click();
	}
	
	public void selectAnyField() {
		WrapperClass.driver.findElement(By.linkText("Company")).click();
	}
	
	public void closeApplication() {
		WrapperClass.closeBrowser();
	}
}
