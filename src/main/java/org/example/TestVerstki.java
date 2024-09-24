package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestVerstki {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //новый вариант

        driver.get("https://devby.io/");

        WebElement element3 = driver.findElement(By.xpath("//a[text() = 'Support us']"));

        String par3 = element3.getCssValue("font-weight");
    }
}
