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
            $$("body")
            $$(#12345) - по id
            $$(".wYq63b") - по классу
            $$("[role='main']") - Поиск по любому атрибуту кроме класса и id, где role - название атрибута, main - значение атрибута
            $$("div[role]") - поиск ВСЕХ тегов div, где есть атрибут role
            $$("[role]") - поиск ВСЕХ объектов, где есть атрибут role
            $$("div[role*='ain']") - *= означает поиск по части
            $$("div[role^='mai']") - ^= означает поиск по первым символам
            $$("div[role$='ain']") - $= означает поиск по последним символам
            $$(".col.rhcol.rhstc5") - по нескольким классам одного объекта
            $$(".col.rhcol[]") - по двум классам и одному атрибуту
            $$(div:not(.col)) - поиск div в котором нет класса col
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
