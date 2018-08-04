package com.capita;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.capita.FcbkCode;

public class FcbkPomPrjct {
	// WebDriver dr;
	@BeforeTest
	public void SetUp()
	{
		FcbkCode.dr=new FirefoxDriver();
		FcbkCode.dr.get("https://www.facebook.com/");
		FcbkCode.dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FcbkCode.dr.manage().window().maximize();
	}
	@Test
	public void Callingmeth()
	{
	    FcbkCode.Email();
		FcbkCode.pass("welcome1234");
	}
	@AfterTest
	public void Closedr()
	{
		FcbkCode.dr.close();
	}

}
