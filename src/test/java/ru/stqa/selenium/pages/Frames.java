package ru.stqa.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
  WebDriver driver;
  @Test
    public  void  testFrame() throws InterruptedException {
      driver = new ChromeDriver();
      driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_input_text");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//a[@class='w3-button w3-bar-item topnav-icons fa fa-adjust']")).click();
      Thread.sleep(3000);
      driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
      driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("qqqq");
      Thread.sleep(3000);
      driver.switchTo().defaultContent();
      driver.quit();

  }
}
