package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseFunc {
    private WebDriver driver;
    private WebDriverWait wait; //objekt otvechajuschij za ozhidanija
    private Actions actions;

    public BaseFunc() {  // controctor for BaseFunc
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        actions = new Actions(driver);

        wait = new WebDriverWait(driver, Duration.ofSeconds(5)); //ozhidanie, kotoroe budet zhdatj v brows. okne max 5 sek
    }

    public void goToUrl(String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) url = "http://" + url; //adres ne nachinajetsja s http i https, togda dobavljajem http

        driver.get(url);
    }

    public HomePage openHomePage() {
        goToUrl("1a.lv");
        return new HomePage(this);
    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click(); //zhdem do kakogo-to uslovija (poka element pojavitsja i stanet klikabeljnim
        //        driver.findElement(locator).click();

    }

    public void scrollToElement(By locator) {
        WebElement we = driver.findElement(locator);

        actions.scrollToElement(we);
        actions.perform();
    }


}
