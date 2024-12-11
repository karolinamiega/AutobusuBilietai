package lt.vcs.pom.test.autobusubilietai;

import lt.vcs.pom.page.autobusubilietai.AutobusuBilietaiPage;
import lt.vcs.pom.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AutobusuBilietaiTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        AutobusuBilietaiPage.open();
    }

    @Test
    public void testAutobusuBilietaiPrisijungimas() throws InterruptedException {

        String elPastas = "nugaraitekarolina@gmail.com";
        String slaptazodis = "Karolina@1";
        String expectedUrl = "https://www.autobusubilietai.lt/user";
        String expectedTitle = "autobusubilietai.lt Pigesni bilietai, jokių eilių Užsakymų istorija";
        String expectedName = "Karolina Nugaraitė";


        AutobusuBilietaiPage.clickOnButtonPrisijungti();

        AutobusuBilietaiPage.inputEmail(elPastas);
        AutobusuBilietaiPage.inputPassword(slaptazodis);
        AutobusuBilietaiPage.clickOnRedButtonPrisijungti();

        Thread.sleep(3000);

        String actualUrl = AutobusuBilietaiPage.checkUrl();
        String actualTitle = AutobusuBilietaiPage.checkTitle();
        String actualName = AutobusuBilietaiPage.checkName();

        Assert.assertEquals(actualUrl, expectedUrl);
        Assert.assertEquals(actualTitle, expectedTitle);
        Assert.assertEquals(actualName, expectedName);
    }
}
