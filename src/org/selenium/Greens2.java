package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Greens2 {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement prsClick = driver.findElement(By.id("heading201"));
		prsClick.click();

	}

}
