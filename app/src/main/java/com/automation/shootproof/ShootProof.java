package com.automation.shootproof;

import org.openqa.selenium.By;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShootProof  {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\\\Users\\Acer\\workspace\\ShootPrrof\\app\\libs\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.shootproof.com");

        // Find the first instance of the link "GET STARTED" and click on it
        driver.findElement(By.linkText("GET STARTED")).click();
        System.out.println("Page title is: " + driver.getTitle());  //Print the name of the page to log page transition

        // Return to main ShootProof page
        driver.navigate().back();
        System.out.println("Page title is: " + driver.getTitle());  //Print the name of the page to log page transition

        By by = By.xpath("//*[@class='banner']/div/p[2]/a");

        // Verify "GET STARTED" link is present, if not throw exception, if it is then click it.
        //Use the XPATH for the bottom link as the only difference in identifiers for the two links is the XPATH
        assertEquals("GET STARTED",driver.findElement(by).getText());
        driver.findElement(by).click();
        System.out.println("Page title is: " + driver.getTitle());  //Print the name of the page to log page transition

        driver.quit();
    }

}