package org.you;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Deliverypartner extends classbase {
	@Test
	private void tc1() throws InterruptedException {
		launchUrl("http://localhost/emarket/index.php");
		windowMaximize();
		WebElement dp = driver.findElement(By.xpath("(//span[contains(text(),' Register here')])[3]"));
		dp.click();
		Thread.sleep(3000);
		WebElement fn = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fn.sendKeys("jackulin");
		WebElement ln = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		ln.sendKeys("Santhi");
		Thread.sleep(3000);
		WebElement gen = driver.findElement(By.xpath("//input[@value='Female']"));
		gen.click();
		Thread.sleep(3000);
		WebElement mob = driver.findElement(By.xpath("(//input[@type='number'])[1]"));
		mob.sendKeys("7766554433");
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		email.sendKeys("maniiii@gmail.com");
		Thread.sleep(3000);
		WebElement add  = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		add.sendKeys("2/7,annakovil,marutham");
		Thread.sleep(3000);
		WebElement lan = driver.findElement(By.xpath("//input[@placeholder='Landmark']"));
		lan.sendKeys("madhurai");
		Thread.sleep(3000);
		WebElement loc = driver.findElement(By.name("locality"));
		loc.sendKeys("kovil");
		Thread.sleep(3000);
		WebElement taluk  = driver.findElement(By.xpath("//input[@placeholder='Taluk']"));
		taluk.sendKeys("kochi");
		Thread.sleep(3000);
		WebElement  dis = driver.findElement(By.name("district"));
		dis.sendKeys("Madhurai");
		Thread.sleep(3000);
		WebElement st = driver.findElement(By.xpath("//input[@placeholder='State']"));
		st.sendKeys("Tmailnadu");
		Thread.sleep(3000);
		WebElement pin= driver.findElement(By.name("pincode"));
		pin.sendKeys("630390");
		Thread.sleep(3000);
		WebElement pa = driver.findElement(By.name("pass"));
		pa.sendKeys("hanina");
		Thread.sleep(3000);
		WebElement cpa = driver.findElement(By.xpath("//input[@placeholder='Confirm Password']"));
	    cpa.sendKeys("hanina");
		WebElement btn= driver.findElement(By.xpath("//input[@value='Submit']"));
		btn.click();
		Alert a2 = driver.switchTo().alert();
		String text = a2.getText();
		System.out.println(text);
		Thread.sleep(3000);
		a2.accept();
		
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

	@AfterMethod
	private void endthedate() {
		System.out.println("end the date");

	}

	@Test
	private void tc2() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("http://localhost/emarket/dlogin.php");
		windowMaximize();
		Thread.sleep(3000);
		WebElement em = driver.findElement(By.name("Email"));
		em.sendKeys("maniiii@gmail.com");
		Thread.sleep(3000);
		WebElement pas = driver.findElement(By.name("Password"));
		pas.sendKeys("hanina");
		Thread.sleep(3000);
		WebElement lo = driver.findElement(By.name("login"));
		lo.click();
		Alert a3 = driver.switchTo().alert();
		a3.accept();

	}

	@Test
	private void tc3() {
		System.out.println("agri");

	}
}
