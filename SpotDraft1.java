package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SpotDraft1 {
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Satya Mohanty\\Desktop\\chrome\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.goodreads.com/"); 
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Sign up with email")).click();
        driver.findElement(By.name("customerName")).sendKeys("Satyajit Mohanty");
        driver.findElement(By.name("email")).sendKeys("Satyajitmohanty014@gmail.com");
        driver.findElement(By.name("password")).sendKeys("12345678");
        driver.findElement(By.name("passwordCheck")).sendKeys("12345678");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.name("code")).sendKeys("347547");
        driver.findElement(By.className("a-button-input")).click();
               
}
}
