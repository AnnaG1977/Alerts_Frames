package ru.stqa.selenium.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Alerts {
    WebDriver driver;
    Alert alert;

    @Test
    public  void  alertsTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("file:///C:/Automat_TelRan/AlertsDemo.html");
        Thread.sleep(3000);
        List<WebElement> buttons = driver.findElements((By.xpath("//button")));
        //------Simple alert---------
        buttons.get(0).click();
        Thread.sleep(3000);
        alert = driver.switchTo().alert();
        System.out.println("text of alert" + alert.getText());
        alert.accept();
        Thread.sleep(3000);

        //------ alert #2  Confirm Box---------
        buttons.get(1).click();
        Thread.sleep(3000);
        alert = driver.switchTo().alert();
        System.out.println("text of alert" + alert.getText());
        //-----press OK button
        alert.accept(); // button OK
        // press Cancel button  ------
        buttons.get(1).click();
        Thread.sleep(3000);
        alert = driver.switchTo().alert();
        System.out.println("text of alert" + alert.getText());
        Thread.sleep(2000);
        alert.dismiss();
        Thread.sleep(2000);

        //------ alert #3 Prompt Box---------
        buttons.get(2).click();
        Thread.sleep(3000);
        alert = driver.switchTo().alert();
        alert.sendKeys("Ivan Ivanov");
        alert.accept();
        Thread.sleep(2000);

        buttons.get(2).click();
        Thread.sleep(3000);
        alert = driver.switchTo().alert();
        alert.sendKeys("Ivan Ivanov");
        alert.dismiss();
        Thread.sleep(2000);
        driver.quit();
    }
}
