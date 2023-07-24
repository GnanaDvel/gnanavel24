package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement textSelect = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		String text = textSelect.getText();
		System.out.println(text);
		driver.quit();
		

	}

}
