import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BaseFunc;
import pages.HomePage;

import java.util.List;

public class CartTest {
    private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By MAIN_MENU = By.xpath(".//ul[@class = 'submenu-lvl1__list']");
    private final By MAIN_MENU_ITEM = By.xpath(".//li[contains(@class, 'submenu-lvl1__list-item')]");

    @Test
    public void itemsInCartCheckOnPageObjects() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openHomePage();

        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
    }

//    @Test
//    public void itemsInCartCheck() {
//
//        WebDriver browser = new ChromeDriver();
//        browser.manage().window().maximize();
//
//        //Open Home Page
//        browser.get(HOME_PAGE_URL);
//
//        //Accept cookies
//        browser.findElement(ACCEPT_COOKIES_BTN).click();
//
//        List<WebElement> mainMenus = browser.findElements(MAIN_MENU);
//        WebElement mainMenuToUse = mainMenus.get(1);//iz vsex menjushek budem bratj vtoruju
//
//        List<WebElement> mainMenuItems = mainMenuToUse.findElements(MAIN_MENU_ITEM);
//        //ischem menu Spēļu konsoles un piederumi iz spiska
//
////        for (int i = 0; i < mainMenuItems.size(); i++) {  //size: kolichestvo elementov v tekuschem spiske
////            if (mainMenuItems.get(i).getText().equals("Spēļu konsoles un piederumi")) {
////                mainMenuItems.get(i).click();
////                break; // ostanovitj cikl, daljshe ne bezhit
////            }
////        }
//        //aljternativa:  for each
//        for (WebElement menuItem : mainMenuItems) {
//            if(menuItem.getText().equals("Spēļu konsoles un piederumi")) {
//                menuItem.click();
//                break;
//            }
//
//        }
//    }
}
