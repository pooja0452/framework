package com.capita;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FcbkCode {
	static WebDriver dr;
	
	public static void Email()
	  {
          dr.findElement(By.xpath(".//*[@id='email']")).sendKeys("poojakumari.0452@gmail.com");
        
		// String actual=GetFName.sendKeys(keyword);
		 //Assert.assertEquals(actual, expected);
		//return keyword;

		}
	public static void pass(String keyword)
	  {
      WebElement Getpass =  dr.findElement(By.xpath(".//*[@id='pass']"));
       Getpass.clear();
	  Getpass.sendKeys(keyword);
		

		}

}
