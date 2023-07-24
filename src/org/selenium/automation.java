package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class automation {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement txtLanguage= driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched'][1]"));
		txtLanguage.sendKeys("gnanavel25");
		

	}

}
