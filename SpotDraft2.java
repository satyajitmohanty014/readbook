package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SpotDraft2 {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Satya Mohanty\\Desktop\\chrome\\Chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.navigate().to("https://www.goodreads.com/"); 
    driver.manage().window().maximize();
    driver.findElement(By.partialLinkText("Sign In")).click();
    driver.findElement(By.partialLinkText("Sign in with email")).click();
    driver.findElement(By.id("ap_email")).sendKeys("Satyajitmohanty014@gmail.com");
    driver.findElement(By.id("ap_password")).sendKeys("12345678");
    driver.findElement(By.xpath("//input[contains(@type, 'checkbox')]")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("signInSubmit")).click();
    driver.findElement(By.xpath("//img[contains(@alt, 'Dismiss')]")).click();
    driver.findElement(By.name("q")).sendKeys("Art");
    driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).click();
    driver.findElement(By.className("progressTrigger")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//a[(text()='View shelf')])[1]")).click();
    driver.findElement(By.xpath("//img[(@alt=\"Remove from my books\")]")).click();
    Alert a2=driver.switchTo().alert();
    String store1=a2.getText();
    System.out.println(store1);
    a2.accept();
    driver.findElement(By.xpath("(//img[(@alt=\"Satyajit Mohanty\")])[1]")).click();
    driver.findElement(By.xpath("(//a[(text()='Sign out')])[1]")).click();
    driver.close();
}
}





