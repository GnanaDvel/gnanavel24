package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class google {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement txtEnter = driver.findElement(By.id("APjFqb"));
		txtEnter.sendKeys("GREENS TECHNOLOGY");
		driver.quit();
	

	}

}
