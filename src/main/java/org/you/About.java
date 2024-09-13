package org.you;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class About extends classbase {
	@Test
	private void tc1() throws InterruptedException  {
		launchUrl("http://localhost/emarket/index.php");
		windowMaximize();
		WebElement a = driver.findElement(By.xpath("//a[contains(text(),'about')]"));
		Thread.sleep(3000);
		a.click();
		}
     @BeforeClass
	private void launchtheurl() {
		launchBrowser();
		windowMaximize();

	}

	@AfterClass
	private void endthebrowser() {
		closeEntireBrowser();

	}

	@BeforeMethod
	private void startthedate() {
		System.out.println("start the date");

	}
	@Test
private void tc2() throws InterruptedException {
		Thread.sleep(3000);
		launchUrl("http://localhost/emarket/about.php");
		windowMaximize();


}
	@AfterMethod
	private void endthedate() {
		System.out.println("end the date");

	}


	}




