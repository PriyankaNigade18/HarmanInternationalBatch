package com.SwagLabs.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage
{
private WebDriver driver;

	public CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locator
	@FindBy(xpath="//div[@class='inventory_item_name']")
	WebElement product;
	
	@FindBy(xpath="//button[text()='Remove']")
	WebElement removeBtn;
	
	@FindBy(id="continue-shopping")
	WebElement contBtn;
	
	@FindBy(id="checkout")
	WebElement checkBtn;
	
	
	//Actions
	public void getProductDeatils()
	{
		System.out.println("Product added to Cart: "+product.getText());
	}
	
	public void removeProduct()
	{
		removeBtn.click();
		System.out.println("Product Removed from the cart!");
		
	}
	
	public InventoryPage continueShopping()
	{
		contBtn.click();
		return new InventoryPage(driver);
	}
	
	public CheckoutPage doCheckOut()
	{
		checkBtn.click();
		return new CheckoutPage(driver);
	}
	
	
}
