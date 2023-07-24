package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class swiggy {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.swiggy.com/");
        driver.manage().window().maximize();
        WebElement txtLocation = driver.findElement(By.id("location"));
        txtLocation.sendKeys("omr");
        driver.quit();

	}

}
