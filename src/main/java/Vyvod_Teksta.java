import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Vyvod_Teksta {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //новый вариант

        driver.get("https://www.avito.ru/ufa/transport");
        //WebElement element3 = driver.findElement(By.cssSelector("page-title-count-wQ7pG"));
        WebElement element3 = driver.findElement(By.cssSelector("popular-rubricator-count-CX8Mx"));

        String par1 = element3.getText();
        System.out.println(par1);
    }
}
