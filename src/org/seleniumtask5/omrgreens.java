package org.seleniumtask5;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class omrgreens {



	public static void main(String[] args) throws IOException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://omrbranch.com/");
	driver.manage().window().maximize();
	
	TakesScreenshot screenshot = (TakesScreenshot) driver;
	
	File source = screenshot.getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	
	File location = new File("C:\\Users\\91959\\eclipse-workspace\\comp\\src\\scrn");
	FileUtils.copyFileToDirectory(source, location);
	
	 
		

	}

}
