package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
        WebElement txtUserName = driver.findElement(By.id("email"));
        txtUserName.sendKeys("gnanavel");
        WebElement txtUserPassword = driver.findElement(By.id("pass"));
        txtUserPassword.sendKeys("257964");
        WebElement prsClick = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy']"));
        prsClick.click();
	}

}
