import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Lesson1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //driver.get("https://www.google.com/");
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
            $$("a:not(href^='http')") - запрос выводит все ссылки, в начале которых нет 'http'
            $$("div[jscontroller='TxZWcc'] div.liYKde") - ищет div с классом liYKde внутри другого div с jscontroller='TxZWcc'. ВАЖНО! Здесь не определяется глубина вложенности
            $$("div[jscontroller='TxZWcc'] > div.liYKde") - ищет div с классом liYKde внутри РОДИТЕЛЬСКОГО div с jscontroller='TxZWcc'
            $$("ul li:first-child") - Если у ul много элементов li, ищет первый child
            $$("ul li:last-child") - Если у ul много элементов li, ищет последний child
            $$("ul li:тер-child(2)") - Если у ul много элементов li, ищет второй(2) child
        className
        id() - Могут быть случаи, когда айдишники смещаются, если добавляются элементы. Поэтому надо поддерживать, что не очень удобно
        linkText() - ищут по всему тексту ссылки (используют больше ресурсов, в идеале по возможности использовать что-то другое)
        partialLinkText() - ищут по части текста ссылки (используют больше ресурсов, в идеале по возможности использовать что-то другое)
        name - ищет по атрибуту name
        tagName - ищут по атрибуту tagName
        */
        //WebElement input = driver.findElements(By.partialLinkText());

        //явное ожидание появления элемента 10 секунд
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //старый вариант
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //новый вариант

        //Явное ожидание 10 секунд
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10)) //Ожидаем появления 10 секунд
                .until(ExpectedConditions.presenceOfElementLocated(By.id("123"))));//presenceOfElementLocated - ожидание появления в элементе

        driver.get("https://www.avito.ru/rossiya/avtomobili");
        WebElement element = driver.findElement(By.xpath("(//a[@href='/all/lichnye_veschi'])[1]"));

        String par = element.getAttribute("offsetWidth");
        System.out.println(par);
    }
}
