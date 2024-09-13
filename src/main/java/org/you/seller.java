package org.you;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class seller extends classbase {

	@Test
	private void tc1() throws InterruptedException {
		Thread.sleep(3000);
		launchUrl("http://localhost/emarket/index.php");
		windowMaximize();
		Actions a = new Actions(driver);
		Thread.sleep(3000);
		WebElement hello = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		a.moveToElement(hello).perform();
		WebElement cl = driver.findElement(By.xpath("//a[contains(text(),'Are You Seller')]"));
		cl.click();
		Thread.sleep(3000);
		WebElement finame = driver.findElement(By.name("fname"));
		finame.sendKeys("Hanina");
		WebElement lastname = driver.findElement(By.name("lname"));
		lastname.sendKeys("Johnson");
		WebElement gender = driver.findElement(By.xpath("//input[@value='Female']"));
		gender.click();
		Thread.sleep(3000);

		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("9659762124");
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("jacklinel@gmail.com");
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("2/5,chennai,Annanagar");
		WebElement landmark = driver.findElement(By.name("landmark"));
		landmark.sendKeys("kovil");
		WebElement locality = driver.findElement(By.name("locality"));
		locality.sendKeys("maiyanur");
		WebElement taluk = driver.findElement(By.name("taluk"));
		taluk.sendKeys("kuruvampattai");
		WebElement dis = driver.findElement(By.name("district"));
		dis.sendKeys("chennai");
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("Tamilnadu");
		WebElement pin = driver.findElement(By.name("pincode"));
		pin.sendKeys("670312");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("elvina11");
		WebElement cp = driver.findElement(By.name("cpass"));
		cp.sendKeys("elvina11");
		Thread.sleep(3000);
		WebElement sub = driver.findElement(By.name("submit"));
		sub.click();
		Thread.sleep(3000);
		Alert a1 = driver.switchTo().alert();
		String text = a1.getText();
		System.out.println(text);
		a1.accept();
		Thread.sleep(3000);
		WebElement mail = driver.findElement(By.name("Email"));
		mail.sendKeys("jacklinel@gmail.com");
		Thread.sleep(3000);
		WebElement p = driver.findElement(By.name("Password"));
		p.sendKeys("elvina11");
	Thread.sleep(3000);
		WebElement lo = driver.findElement(By.name("login"));
		lo.click();
		Thread.sleep(3000);
		a1.accept();
	}

	@BeforeMethod
	private void startthedate() {
		System.out.println("Start the date");
	}

	@AfterMethod
	private void endthedate() {
		System.out.println("end the date");
	}

	@BeforeClass
	private void launchTheBrowser() {
		launchBrowser();
		windowMaximize();
	}

	@AfterClass
	private void endthebrowser() {
		closeEntireBrowser();
	}

	@Test
	private void tc2() {
		System.out.println("testcase2");
		
	}

	@Test
	private void tc3() {
		System.out.println("test case3");
	}

	@Test
	private void tc4() {
		System.out.println("test case 4");
	}

}
