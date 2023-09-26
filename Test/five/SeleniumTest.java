package five;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Track;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest {
    @Test
    void findSelenium() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com/");
        WebElement searchBox = webDriver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();
        Thread.sleep(300);
        List<WebElement> webElementList = webDriver.findElements(By.cssSelector("div"));
        boolean search = false;
        for (WebElement webElement : webElementList) {
            if (webElement.getText().contains("https://www.selenium.dev/")){
                    search = true;
                    break;
            }
        }
        assertTrue(search);
        webDriver.quit();
    }

    @Test
    void  sauceDemo() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.saucedemo.com");
        WebElement searchName = webDriver.findElement(By.name("user-name"));
        WebElement searchPassword = webDriver.findElement(By.name("password"));
        WebElement searchButton = webDriver.findElement(By.name("login-button"));

        searchName.sendKeys("standard_user");
        searchPassword.sendKeys("secret_sauce");
        Thread.sleep(300);

        searchButton.submit();

        WebElement searchProduct = webDriver.findElement(By.className("title"));

        assertEquals("Products", searchProduct.getText());

        webDriver.quit();
    }

}
