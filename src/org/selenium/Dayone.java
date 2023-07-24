package org.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Dayone {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\91959\\eclipse-workspace\\comp\\driver.exe\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		// TODO Auto-generated method stub

	}

}
