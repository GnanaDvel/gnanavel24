package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class icicibank {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().maximize();
		WebElement txtUserName = driver.findElement(By.xpath("//input[@name='DUMMY1']"));
		txtUserName.sendKeys("GNANAVEL");
		//driver.quit();

	}

}
