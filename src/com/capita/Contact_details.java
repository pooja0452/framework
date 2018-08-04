package com.capita;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Contact_details {
	static WebDriver dr;

	private FileInputStream input;
	private String RepositoryFile;
	static Properties p;
	
	public Contact_details(WebDriver dr) throws IOException
	{
	    this.dr = dr;
	    p = new Properties();
		//RepositoryFile = fileName;
		//input = new FileInputStream(RepositoryFile);
		//p.load(input);
		InputStream input = new FileInputStream("personalDet.properties");
		p.load(input);
	  }
	
}
