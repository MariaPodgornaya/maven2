package tests;

import Helper.PropertiesHelper;
import org.junit.Test;

public class LoginTest extends SimpleTest {

    @Test
    public  void loginTest() {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignButton();
        user.mainPage.checkText();
        user.mainPage.fillInEmailAddressField (PropertiesHelper.INSTANCE.getProperty("email"));
        user.mainPage.fillInPasswordField(PropertiesHelper.INSTANCE.getProperty("passord"));
    }

}
