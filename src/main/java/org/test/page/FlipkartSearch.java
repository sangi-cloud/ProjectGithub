package org.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class FlipkartSearch extends BaseClass{
	
	public FlipkartSearch() {

	PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
	public WebElement search;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement searchbtn;

	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	public WebElement closebtn;
	
	@FindBy(xpath="//div[@class='_4rR01T']")
	public WebElement products;
	
	@FindBy(xpath="//div[@class='_30jeq3 _1_WHN1']")
	public WebElement price;
	
	public WebElement getSearch() {
		return search;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getClosebtn() {
		return closebtn;
	}
	
	
	
}
