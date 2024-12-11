package lt.vcs.pom.page.autobusubilietai;

import lt.vcs.pom.page.Common;
import org.openqa.selenium.By;

public class AutobusuBilietaiPage {

    private static final By buttonPrisijungti = By.xpath("(//div[@class='header-left-buttons'])/button[2]");
    private static final By emailField = By.xpath("//input[@name='username']");
    private static final By passwordField = By.xpath("//input[@name='password']");
    private static final By buttonRedLogin = By.xpath("(//button[@type='submit'])[3]");
    private static final By name = By.xpath("//div[@aria-label='Suskleidžiamas vartotojo meniu' and contains(text(), 'Karolina Nugaraitė')]");


    public static void open() {
        Common.setUpChrome(10);
        Common.openUrl("https://www.autobusubilietai.lt/");
    }

    public static void clickOnButtonPrisijungti() {
        Common.clickOnElements(buttonPrisijungti);
    }

    public static void inputEmail(String value) {
        Common.sendKeysToElement(emailField, value);
    }

    public static void inputPassword(String value) {
        Common.sendKeysToElement(passwordField, value);
    }

    public static void clickOnRedButtonPrisijungti() {
        Common.clickOnElements(buttonRedLogin);
    }

    public static String checkUrl() {
        return Common.getCurrentUrl();
    }

    public static String checkTitle() {
        return Common.getTabTitle();
    }

    public static String checkName() {
        return Common.getTextFromElement(name);
    }
}
