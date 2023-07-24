package org.seleniumtask5;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
public class Amazon {

	public static  void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor Executor = (JavascriptExecutor)driver;
		
		WebElement click = driver.findElement(By.xpath("(//a[@class='nav_a'])[48]"));

		Executor.executeScript("arguments[0].scrollIntoView();",click);
		
		
		File source = click.getScreenshotAs(OutputType.FILE);
		System.out.println(source
				);
		
		File target = new File("C:\\Users\\91959\\eclipse-workspace\\comp\\src\\scrn");
		
		FileUtils.copyFileToDirectory(source, target);
		
		
		
		
		

	}

}
