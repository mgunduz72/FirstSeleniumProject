package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
	public static void main(String[] args) throws InterruptedException {
		
		// For asas chrome we use "webdriver.chrome.driver" and for firefox we use "webdriver.gecko.driver" and we get their locations from
		// driver folder that we created inside the document on this computer. We basically rigth click in the driver and get info-where
		// and we copy that place, additionally we place /chromedriver or /chromedriver
		
		//1- it sets chrome driver's path to webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "/Users/emin/Documents/selenium dependencies/drivers/chromedriver");
		//System.setProperty("webdriver.gecko.driver", "/Users/emin/Documents/selenium dependencies/drivers/geckodriver");
		
		// 2-Create new ChromeDriver Object(OPen Chrome)
		
		WebDriver driver = new ChromeDriver();
		
		// open firefox browser
		
		//WebDriver driver = new FirefoxDriver();
		
		//3- navigate to google.com
		driver.get("http://www.google.com");
		//4- bring your chrome to front screen
		driver.switchTo().window(driver.getWindowHandle());  // This code will bring the page to front screen
		
//		WebElement searchBox = driver.findElement(By.id("lst-ib"));  // We need to add the id for search box
//		searchBox.sendKeys("gmail");
//		searchBox.sendKeys(Keys.ENTER);
		
		//5- Find the sign in button
		WebElement SignIn = driver.findElement(By.id("gb_70"));  // We need to add the id for search box
		
		//6- Click to sign in button
		SignIn.click();
		
		//7- Finds email text box
		WebElement email = driver.findElement(By.id("identifierId"));
		
		//8- Sends email address to text box
		email.sendKeys("gunduztx@gmail.com");
		//9- hits enter
		email.sendKeys(Keys.ENTER);
		//10- waits for 1 sec
		Thread.sleep(1000);
		
		//11- finds the password text box
		WebElement pass = driver.findElement(By.name("password"));
		//12- Sends the password
		pass.sendKeys("2015Emin");
		pass.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
    	WebElement searchBox = driver.findElement(By.id("lst-ib"));  // We need to add the id for search box
		searchBox.sendKeys("Subway restaurant near me");
		Thread.sleep(1000);
		searchBox.sendKeys(Keys.ENTER);
		//13-Prints loaded test result
		System.out.println(driver.getTitle());
		//14- close chrome and end the test. 
		driver.close();
		
	}

}
