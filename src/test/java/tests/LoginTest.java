package tests;

import org.junit.Test;

public class LoginTest extends SimpleTest {

    @Test
    public  void loginTest() {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignButton();
        user.mainPage.fillIEmailAddress("automationstep@gmail.com")
    }

}
