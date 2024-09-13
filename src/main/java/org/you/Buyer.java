package org.you;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Buyer extends classbase {
	@Test
	private void tc1() throws InterruptedException {
		launchUrl("http://localhost/emarket/index.php");
		windowMaximize();
		Thread.sleep(3000);
		WebElement buyer = driver.findElement(By.xpath("(//span[contains(text(),' Register here')])[2]"));
		buyer.click();
		WebElement fn = driver.findElement(By.name("fname"));
		fn.sendKeys("Rishiya");
		WebElement ln = driver.findElement(By.name("lname"));
		ln.sendKeys("Johnson");
		WebElement ge = driver.findElement(By.xpath("//input[@value='Female']"));
		ge.click();
		WebElement ph = driver.findElement(By.name("phone"));
		ph.sendKeys("8838400673");
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("rishiyaja@gmail.com");
		WebElement add = driver.findElement(By.name("address"));
		add.sendKeys("3/4,madurai,kovil");
		WebElement lad = driver.findElement(By.name("landmark"));
		lad.sendKeys("chruch");
		WebElement local = driver.findElement(By.name("locality"));
		local.sendKeys("Maiyanur");
		WebElement ta = driver.findElement(By.name("taluk"));
		ta.sendKeys("Madhurai");
		WebElement dis = driver.findElement(By.name("district"));
		dis.sendKeys("Mahurai");
		WebElement st = driver.findElement(By.name("state"));
		st.sendKeys("Tamilnadu");
		WebElement pin = driver.findElement(By.name("pincode"));
		pin.sendKeys("670512");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("rishi");
		WebElement cl = driver.findElement(By.name("cpass"));
		cl.sendKeys("rishi");
		Thread.sleep(3000);
		WebElement but = driver.findElement(By.name("submit"));
		but.click();
		Thread.sleep(3000);
		Alert a1 = driver.switchTo().alert();
		String text = a1.getText();
		System.out.println(text);
		a1.accept();
		WebElement em = driver.findElement(By.name("Email"));
		em.sendKeys("rishiyaja@gmail.com");
		WebElement pas = driver.findElement(By.name("Password"));
		pas.sendKeys("rishi");
		Thread.sleep(3000);
		WebElement log = driver.findElement(By.name("login"));
		log.click();
		Thread.sleep(3000);
		a1.accept();
		


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
		launchUrl("http://localhost/emarket/buyer/index.php");
		windowMaximize();
		Thread.sleep(3000);
		WebElement shop = driver.findElement(By.xpath("//a[contains(text(),'shop')]"));
		shop.click();
		Thread.sleep(3000);
		WebElement order = driver.findElement(By.xpath("//a[contains(text(),'your orders')]"));
		order.click();
		Thread.sleep(3000);
		WebElement cl = driver.findElement(By.xpath("//a[@class='fas fa-search']"));
		cl.click();
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.name("search_box"));
		search.sendKeys("Nuts");
		Thread.sleep(3000);
		WebElement searchbtn = driver.findElement(By.name("search_btn"));
		searchbtn.click();
		
		
		
	
		

	}
	@Test
	private void tc3() {
		System.out.println("agri testcase3");

	}

}
