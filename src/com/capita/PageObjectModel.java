package com.capita;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.capita.Personal_Details;

public class PageObjectModel {
	 WebDriver dr;
	private Personal_Details Obj;
	@BeforeClass
	public void SetUp() throws IOException 
	{
		dr=new FirefoxDriver();
		dr.get("https://www.careers.capita.co.in/Default.aspx");
		dr.findElement(By.xpath(".//*[@id='subMenu']/ul/li/a")).click();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		Obj = new Personal_Details(dr);
	}
	@Test
	public void EnterDetails() throws InterruptedException
	{
		Personal_Details.title();
		Personal_Details.FirstName("pooja");
		Personal_Details.FathersName("Satyendra Singh");
		Personal_Details.RelWithFather("Daughter");
		Personal_Details.LastName("Singh");
		Personal_Details.MaritalStatus();
		Personal_Details.Gender();
		Personal_Details.DOByear();
		Personal_Details.DOBmonth();
		Thread.sleep(2000);
		Personal_Details.DOBdate();
		Personal_Details.PanNo("clugh9540P");
		Personal_Details.EmailId("ptpoojasingh0452@gmail.com");
		Personal_Details.Next();
		
	}
	

}
