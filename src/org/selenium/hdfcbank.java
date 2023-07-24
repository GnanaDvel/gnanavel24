package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class hdfcbank {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/ \r\n"
				+ "");
		driver.manage().window().maximize();
		WebElement txtEnterId = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
		txtEnterId.sendKeys("GNANAVEL");

	}

}
