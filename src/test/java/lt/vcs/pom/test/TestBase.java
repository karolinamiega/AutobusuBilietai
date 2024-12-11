package lt.vcs.pom.test;

import lt.vcs.pom.page.Common;
import lt.vcs.pom.page.autobusubilietai.AutobusuBilietaiPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {

    @BeforeMethod
    public void setUp(){
        AutobusuBilietaiPage.open();
    }

    @AfterMethod
    public void tearDown(){
        Common.close();
    }
}
