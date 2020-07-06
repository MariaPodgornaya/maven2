package tests;

import org.junit.Test;

public class AddToCartItemTest extends SimpleTest {

    @Test
    public void addToCartItemTest () {
        user.mainPage.openMainPage();
        user.mainPage.clickOnWomanTab();
        user.mainPage.clickOnAddToCartButtonsOnItems(3);
    }
}
