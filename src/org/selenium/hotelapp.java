package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class hotelapp {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		//WebElement txtName = driver.findElement(By.id("username"));
		//txtName.sendKeys("GNANAVEL");
	//	WebElement txtPassword = driver.findElement(By.id("password"));
		//txtPassword.sendKeys("28549");
		driver.manage().window().maximize();
		WebElement txtlogin = driver.findElement(By.xpath("//p[text()='Adactin Launches The Adactin Hotel App! ']"));
		String text =txtlogin.getText();
		System.out.println(text);
		

	}

}


