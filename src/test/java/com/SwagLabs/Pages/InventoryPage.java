package com.SwagLabs.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage
{
	private WebDriver driver;
	
	public InventoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locators
	@FindBy(xpath="//div//div[@class='inventory_item_name ']")
	List<WebElement> productList;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	WebElement addBtn;
	
	@FindBy(xpath="//div[@id='shopping_cart_container']")
	WebElement cartBtn;
	
	
	
	//Actions
	public int getTotalProductCount()
	{
		int count=productList.size();
		return count;
	}
	
	public void getProductDeatils()
	{
		System.out.println("********Product Deatils**********");
		for(WebElement i:productList)
		{
			System.out.println(i.getText());
		}
		
	}
	
	public void addProductToCart(String pname)
	{
		for(WebElement i:productList)
		{

			if(i.getText().contains(pname))
			{
				i.click();//selecting product
				break;
			}
		}
		
		//click on add to cart
		addBtn.click();
		System.out.println("Product added to cart: "+pname);
		
	}
	
	public CartPage getCartPage()
	{
		cartBtn.click();
		return new CartPage(driver);
	}
	

}
