package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseFunc {
    private WebDriver driver;

    public BaseFunc() {  // controctor for BaseFunc
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void goToUrl(String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) url = "http://" + url; //adres ne nachinajetsja s http i https, togda dobavljajem http

        driver.get(url);

    }

    public void openHomePage() {
        goToUrl("1a.lv");
    }
}
