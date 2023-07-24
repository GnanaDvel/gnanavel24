package org.selenium;
import org.openqa.selenium.chrome.ChromeDriver;
public class LinkHotel {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("//adactinhotelapp.com/");
		driver.manage().window().maximize();

	}

}
