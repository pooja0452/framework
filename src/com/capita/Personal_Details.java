package com.capita;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;

public class Personal_Details {
	 static WebDriver dr;

		private FileInputStream input;
		private String RepositoryFile;
	   //private static Properties p= new Properties();
		static Properties p;
	
	
	
	public Personal_Details(WebDriver dr) throws IOException
	{
	    this.dr = dr;
	    p = new Properties();
		//RepositoryFile = fileName;
		//input = new FileInputStream(RepositoryFile);
		//p.load(input);
		InputStream input = new FileInputStream("personalDet.properties");
		p.load(input);
	  }
	
	public static void title()
	{
		//By GetTitleXpath=By.xpath((String)p.get("TitleXpath"));
		
		 WebElement GetTitle=dr.findElement(By.xpath(p.getProperty("TitleXpath")));
		 Select Titl=new Select(GetTitle);
		 Titl.selectByValue("Mrs.");
	}
	
	  public static void FirstName(String keyword)
	  {
          WebElement GetFName =  dr.findElement(By.xpath(p.getProperty("FNXpath")));
          GetFName.clear();
		  GetFName.sendKeys(keyword);

		}
	  public static void FathersName(String keyword)
	  {
		
		WebElement GetFaName=dr.findElement(By.xpath(p.getProperty("FathersNMXpath")));
		GetFaName.clear();
		GetFaName.sendKeys(keyword);
	  }
		
	  public static void RelWithFather(String keyword)
	  {
		
		WebElement GetRelWithFa=dr.findElement(By.xpath(p.getProperty("RelWithFatherXpath")));
		GetRelWithFa.clear();
		GetRelWithFa.sendKeys(keyword);
	  }
	  public static void LastName(String keyword)
	  {
		
		WebElement GetlastNM=dr.findElement(By.xpath(p.getProperty("lastnameXpath")));
		GetlastNM.clear();
		GetlastNM.sendKeys(keyword);
	  }
	  public static void MaritalStatus()
	  {
		
		WebElement GetmaritalStatus=dr.findElement(By.xpath(p.getProperty("MaritalStatusXpath")));
		Select MarStatus=new Select(GetmaritalStatus);
		MarStatus.selectByValue("Married");
	  }
	  public static void Gender()
	  {
		  WebElement GetGender=dr.findElement(By.xpath(p.getProperty("GenderXpath")));
		  Select Gen=new Select(GetGender);
		  Gen.selectByValue("Female");
	  }
	  public static void DOByear()
	  {
		 // WebElement GetYear=dr.findElement(By.xpath(p.getProperty("YearXpath")));
		  Select yearOfBirth=new Select(dr.findElement(By.xpath(p.getProperty("YearXpath"))));
		  yearOfBirth.selectByValue("1992");
	  }
	  public static void DOBmonth()
	  {
		 // WebElement GetYear=dr.findElement(By.xpath(p.getProperty("YearXpath")));
		  Select BirthMonth=new Select(dr.findElement(By.xpath(p.getProperty("MonthXpath"))));
		  BirthMonth.selectByValue("2");
	  }
	  public static void DOBdate()
	  {
		 // WebElement GetYear=dr.findElement(By.xpath(p.getProperty("YearXpath")));
		  Select BirthDate=new Select(dr.findElement(By.xpath(p.getProperty("DateXpath"))));
		  BirthDate.selectByIndex(4);
	  }
	  public static void PanNo(String keyword)
	  {
		  WebElement GetpanNo =  dr.findElement(By.xpath(p.getProperty("PanNoXpath")));
		  GetpanNo.clear();
		  GetpanNo.sendKeys(keyword);
	  }
	  public static void EmailId(String keyword)
	  {
		  WebElement GetEmailId =  dr.findElement(By.xpath(p.getProperty("EmailIdXpath")));
		  GetEmailId.clear();
		  GetEmailId.sendKeys(keyword);
	  }
	  public static void Next()
	  {
		  WebElement GetNext =  dr.findElement(By.xpath(p.getProperty("NextXpath")));
		  GetNext.click();
		  
	  }
}
