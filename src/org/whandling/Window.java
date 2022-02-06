package org.whandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Gokulnath\\eclipse-workspace\\Selenium Practice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement txtsrch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsrch.sendKeys("samsung s20 fe 5g", Keys.ENTER);
		
		Thread.sleep(3000);
		
		WebElement fone = driver
				.findElement(By.xpath("//span[text()='Samsung Galaxy S21 FE 5G (White, 8GB, 128GB Storage)'][1]"));
		fone.click();
		Thread.sleep(3000);
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

		Set<String> handle1 = driver.getWindowHandles();
		System.out.println(handle1);

		for (String string : handle1) {
			if (!(string.equals(windowHandle))) {
				driver.switchTo().window(string);

			}
		}
		Thread.sleep(3000);
		WebElement addcart = driver.findElement(By.id("add-to-cart-button"));
		addcart.click();
		//WebElement checkoutbtn = driver.findElement(By.className("a-button-input"));
		//checkoutbtn.click();
		
		WebElement closebtn = driver.findElement(By.id("attach-close_sideSheet-link"));
		closebtn.click();
	}

}
