package org.selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Amazon {

	public static void main(String[] args) {
	 ChromeDriver driver = new ChromeDriver();
	 driver.get(" https://www.amazon.in/");
	 driver.manage().window().maximize();
	 WebElement prsClick = driver.findElement(By.id("twotabsearchtextbox"));
	 prsClick.click();
	 WebElement txtEnter = driver.findElement(By.id("twotabsearchtextbox"));
	 txtEnter.sendKeys("Iphone");
	 WebElement prsSearch = driver.findElement(By.id("nav-search-submit-button"));
	 prsSearch.click();
	 //driver.quit();
	}

}
