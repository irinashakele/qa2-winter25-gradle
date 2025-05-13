package basics.lesson1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsHomeWork {

    private final By CONTACTS_BTN = By.xpath(".//i[@class = 'site-top__menu-right-icon']");
    //private final By FIND_BTN = By.xpath(".//i[@class = 'main-search-submit__icon icon-svg']");
    private final By FIND_BTN = By.xpath(".//i[contains(@class, 'main-search-submit')]");
    private final By SHOPPING_CART_ICON = By.xpath(".//i[@class = 'cart-block__icon icon-svg']");
    private final By MAIN_LOGO_IMAGE = By.xpath(".//img[@class = 'main-logo__image']");
    private final By PRODUCT_CATALOG = By.xpath(".//i[@class = 'main-menu__handle-icon icon-svg']");
    //private final By SPORTS_AND_FITNESS_ICON = By.xpath(".//div[@class= 'submenu-lvl1 submenu-lvl1--invisible']/ul/li[11]/a");
    private final By SPORTS_AND_FITNESS_ICON = By.xpath(".//div[contains(@class, 'submenu-lvl1--index')]");
    private final By ALL_GOODS = By.xpath(".//div[@class= 'submenu-lvl1 submenu-lvl1--invisible']/ul/li[3]/div/div/div[4]/div[5]/a/span[1]");//not final version
    private final By SHOW_DETAILED = By.id("CybotCookiebotDialogBodyLevelDetailsButton");

    private final By ALL_HAMBURGER_MENU = By.id("hamburger-menu");
    private final By SEARCH_PANEL = By.id("twotabsearchtextbox");
    //private final By CHANGE_LANGUAGE = By.xpath(".//span[@class= 'icp-nav-link-inner']");
    private final By SHOPPING_BASKET = By.id("nav-cart");
    private final By CHANGE_ADDRESS_BTN = By.xpath(".//span[@class = 'a-button a-spacing-top-base a-button-primary glow-toaster-button glow-toaster-button-submit']");
    private final By FREE_DELIVERY_PRODUCTS = By.id("CardInstancezGXPlUQxBI8W4IDtb8TaXg");

    private final By NAME_DAY = By.xpath(".//a[@href= 'https://www.delfi.lv']/span");
    private final By LOGO_LINK = By.xpath(".//a[@class= 'logo logo-link']");
    private final By CONTACTS = By.xpath(".//a[@href= 'https://www.delfi.lv/kontakti']/span");
    private final By BUSINESS = By.xpath(".//a[@href= 'https://www.delfi.lv/bizness']/span");
    private final By LANGUAGE = By.xpath(".//a[@class= 'btn language-switch text-size-7 fw-bold btn-size-auto']");
    private final By HEADER_MENU = By.xpath(".//div[@class= 'header-menu--primary-container d-flex justify-content-between flex-nowrap align-items-center h-100 position-relative bottom-header d-none d-lg-flex']");

    private final By SEARCH_PANEL_SPORTSDIRECT = By.id("txtSearch");
    private final By LOGIN = By.id("loginMenu");
    private final By MENS_MENU = By.xpath(".//div[@class= 'Carousel_slides__kLe2U Carousel_hidePaginationMobile__g_qUf Carousel_smallPeepDesktop__QqfDt Carousel_smallPeepMobile__A3fP0 Carousel_slides-spacing-1__S1YZe Carousel_slides-spacing-1-desktop__BMQCE Carousel_slides__kLe2U']/div[1]");
    private final By SHOP_NOW_BTN = By.xpath(".//div[@class= 'HeroBlock_rootContainer__EHVMM Container_container__WyjjB Container_xl__2fBsY']/div[2]/div[2]/div/a");
    private final By GIFTS_BY_BRANDS = By.xpath(".//section[@id= 'section-1-gifts-by-brands']/div/div/div");


    @Test
    public void firstLocatorsTest() {
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();

        browser.get("htpp://1a.lv");
    }

    @Test
    public void secondLocatorsTest() {
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();

        browser.get("https://www.amazon.de/");
    }

    @Test
    public void thirdLocatorsTest() {
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();

        browser.get("https://www.delfi.lv/");

    }

    @Test
    public void fourthLocatorsTest() {
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();

        browser.get("https://www.sportsdirect.lv/");

    }
}

