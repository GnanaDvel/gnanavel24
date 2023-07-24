package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
        WebElement txtUserName = driver.findElement(By.id("email"));
        txtUserName.sendKeys("gnanavel");
        WebElement txtUserPassword = driver.findElement(By.id("pass"));
        txtUserPassword.sendKeys("257964");
	}

}
