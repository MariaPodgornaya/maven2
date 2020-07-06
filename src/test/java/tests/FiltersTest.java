package tests;

import Helper.PropertiesHelper;
import org.junit.Test;

public class FiltersTest extends SimpleTest {

    @Test
    public void filtersTest () {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignButton();
        user.mainPage.fillInEmailAddressField(PropertiesHelper.INSTANCE.getProperty("email"));
        user.mainPage.fillInPasswordField(PropertiesHelper.INSTANCE.getProperty("password"));
        user.mainPage.clickOnSubmitLoginButton();
        user.mainPage.clickOnWomanTab();
        user.mainPage.checkOrangeColorsOnItem();
    }

}
