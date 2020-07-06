package tests;

import org.junit.Test;

public class ContactUsTest extends SimpleTest {

    @Test
    public void contactUsTest() {
        user.mainPage.openMainPage();
        user.mainPage.clickOnContactUsButton();
        user.contactUsPage.clickOnSubjectHeadingDropdown("C:\\Users\\Admin\\Desktop");
        user.contactUsPage.clickOnOrderReferenceDropdown("Webmaster");

        //user.contactUsPage.clickOnAttachFileField();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
