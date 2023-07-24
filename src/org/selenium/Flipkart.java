package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipkart {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement txtEnter = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtEnter.sendKeys("gnanavel");
		driver.quit();

	}

}
