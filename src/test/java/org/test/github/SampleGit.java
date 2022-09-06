package org.test.github;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.baseclass.BaseClass;
import org.test.page.FlipkartSearch;

public class SampleGit extends BaseClass{
	public static void main(String[] args) {
		
		browserLaunch("Chrome");
		urlLaunch("https://www.flipkart.com/");
		impWait(10);
		
		FlipkartSearch f=new FlipkartSearch();
		
		sendKeys(f.search, "iphone 13 pro max");
		
		click(f.closebtn);
		click(f.searchbtn);
		
		List<String> li= new ArrayList<>();
		
		List<WebElement> allproducts = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		
		for (int j = 0; j < allproducts.size(); j++) {
			WebElement we = allproducts.get(j);
			String products = we.getText();
			li.add(products);
		}
		List<String> lis=new ArrayList<>();
		List<WebElement> allprice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for (int i = 0; i < allprice.size(); i++) {
			WebElement we2 = allprice.get(i);
			String price = we2.getText().replace("₹", "Rs.");
			lis.add(price);
		}
		System.out.println("-------PRODUCT LIST-------");
		System.out.println(li);
		
		System.out.println("---------PRICE LIST-------");
		System.out.println(lis);
		
		Map m= new HashMap<>();
		m.put(li, lis);
		Set<Entry<String, String>> es=m.entrySet();
		for (Entry<String, String> entry : es) {
			System.out.println(entry);
			
		}
		System.out.println("---------ASCENDING ORDER-------");
		Collections.sort(lis);
		System.out.println(lis);
		
		System.out.println("---------DESCENDING ORDER-------");
		Collections.reverse(lis);		
		System.out.println(lis);
		
		System.out.println("---------MAXIMUM PRICE-------");
		System.out.println(Collections.max(lis));

		System.out.println("---------MINIMUM PRICE-------");
		System.out.println(Collections.min(lis));

		
		

		}
		
		
		
		
	}
 
	
	
