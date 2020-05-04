package tests;

public class LoginTest extends SimpleTest {

    @Test
    public  void loginTest() {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignButton();
    }

}
