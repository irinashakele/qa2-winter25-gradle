import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.BaseFunc;
import pages.HomePage;
import pages.SignInPage;
//import pages.BaseFunc;
//import pages.HomePage;
//import pages.SignInPage;

import java.util.List;

public class RegistrationTest {
    private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By REGISTRATION_BTN = By.xpath(".//strong[@class = 'user-block__title--strong']");
    private final By REGISTRATION_LINK = By.xpath(".//p[@class = 'users-session-form__signup']/a");
    private final By FIRST_NAME = By.id("user_first_name");
    private final By LAST_NAME = By.id("user_last_name");
    private final By EMAIL = By.id("user_email");
    private final By PASSWORD = By.id("user_password");
    private final By PASSWORD_CONFIRM = By.id("user_password_confirmation");
    private final By MARKETING_CHECKBOX = By.id("user_marketing_consent_1");
    private final By INFORMATION_CHECKBOX = By.id("user_marketing_consent_2");
    private final By REGISTER_BTN = By.name("commit");
    private final By ERROR_MSG = By.xpath(".//p[@class = 'users-session-form__error-message']");

    private final String PASSWORD_COMPLEXITY_ERROR = "parolei jāsatur vismaz viens skaitlis, mazā burti, lielā burti un īpašais simbols";
    private final String PASSWORD_MATCH_ERROR = "nesakrīt ar apstiprinājumu";


    @Test
    public void passwordInconsistencyTestOnPageObject() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openHomePage()
                .acceptCookies()
                .openLoginPage()
                .openRegistrationPage();


//        baseFunc.openHomePage();
//
//        HomePage homePage = new HomePage(baseFunc);
//        homePage.acceptCookies();
//        homePage.openLoginPage();
//
//        SignInPage signInPage = new SignInPage(baseFunc);
//        signInPage.openRegistrationPage();

    }

//    @Test
//    public void passwordInconsistencyTest() {
//        //Open browser window
//        WebDriver browser = new ChromeDriver();
//        browser.manage().window().maximize();
//
//        //Open Home Page
//        browser.get(HOME_PAGE_URL);
//
//        //Accept cookies
//        browser.findElement(ACCEPT_COOKIES_BTN).click();
//        //acceptCookiesBtn.click();
//
//        //Press Registration button
//        //WebElement registrationBtn = browser.findElement(By.xpath(".//strong[@class = 'user-block__title--strong']"));
//        browser.findElement(REGISTRATION_BTN).click();
//        //registrationBtn.click();
//
//        //Click Registration link
//        browser.findElement(REGISTRATION_LINK).click(); //esli boljshoj ekran, to dolzhen srabativatj etot variant
//        WebElement registrationLink = browser.findElement(REGISTRATION_LINK);
//
//        Actions actions = new Actions(browser);
//        actions.scrollToElement(registrationLink); //podskrollivajet do elementa
//        actions.perform();
//
//        registrationLink.click();
//
//        //Enter First Name
//        browser.findElement(FIRST_NAME).sendKeys("Irina");
//
//        //Enter Last Name
//        browser.findElement(LAST_NAME).sendKeys("Tester");
//
//        //Enter E-mail
//        browser.findElement(EMAIL).sendKeys("test@test.lv");
//
//        //Enter Password
//        browser.findElement(PASSWORD).sendKeys("qwerty12345!");
//
//        //Enter Password again with mistake
//        browser.findElement(PASSWORD_CONFIRM).sendKeys("qwerty12345");
//
//        //Scroll to registration button
//        WebElement registrationBtn = browser.findElement(REGISTER_BTN);
//        actions.scrollToElement(registrationBtn);
//        actions.perform();
//
//        //Select marketing check-box
//        browser.findElement(MARKETING_CHECKBOX).click();
//
//        //Select news check-box
//        browser.findElement(INFORMATION_CHECKBOX).click();
//
//        //Press Registration button
//        registrationBtn.click();
//
//        //Check wrong password error message
//        List<WebElement> errorMessages = browser.findElements(ERROR_MSG);
//        Assertions.assertEquals(2, errorMessages.size(), "Wrong errors amount!");
//        Assertions.assertEquals(PASSWORD_COMPLEXITY_ERROR, errorMessages.get(0).getText(), "Wrong error message!");
//        Assertions.assertEquals(PASSWORD_MATCH_ERROR, errorMessages.get(1).getText(), "Wrong error message2!" );
//
//    }
}
