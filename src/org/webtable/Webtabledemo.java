package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtabledemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Gokulnath\\eclipse-workspace\\Selenium Practice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement tableData = driver.findElement(By.id("customers"));
		List<WebElement> columnData = tableData.findElements(By.tagName("td"));

		for (int i = 0; i < columnData.size(); i++) {
			String text = columnData.get(i).getText();
			System.out.println(text);
			
			
			
		
		}

	}

}
