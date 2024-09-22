import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        //WebElement input = driver.findElement(By.xpath("//input[@aria-label='Мне повезёт!']"));

        /*
        xpath - лучше всего выучить
        cssSelector - выучить 35 штук. 5 из них основных
        className
        id() - Могут быть случаи, когда айдишники смещаются, если добавляются элементы. Поэтому надо поддерживать, что не очень удобно
        linkText() - ищут по всему тексту ссылки (используют больше ресурсов, в идеале по возможности использовать что-то другое)
        partialLinkText() - ищут по части текста ссылки (используют больше ресурсов, в идеале по возможности использовать что-то другое)
        name - ищет по атрибуту name
        tagName - ищут по атрибуту tagName
        */
        //WebElement input = driver.findElements(By.partialLinkText());
    }
}
