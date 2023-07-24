package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipkart1 {

	public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
    WebElement textfind = driver.findElement(By.xpath("//span[text()='Get access to your Orders, Wishlist and Recommendations']"));
    String text = textfind.getText();
    System.out.println(text);

	}

}
