package pages;

import org.openqa.selenium.By;

import swaglabs.WrapperClass;

public class SwaglabsAddtoCart {
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
	
	public void addToCart() {
		WrapperClass.driver.findElement(By.xpath("//div[@class='inventory_item']//button[1]")).click();
	}
	
	public void closeApplication() {
		WrapperClass.closeBrowser();
	}
}
