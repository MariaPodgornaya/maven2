package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.MainPages;

public class MainSteps extends ScenarioSteps {

    private MainPages onPages;

    @Step
    public void clickOnSignButton() {
        onPages.clickOnSignButton();
    }

    @Step
    public void openMainPage() {
        onPages.openMainPage();
    }

    @Step
    public void checkText() {
        onPages.checkText();
    }

    @Step
    public void fillInEmailAddressField (String email){
        onPages.fillInEmailAddressField(email);
    }

    @Step
    public void fillInPasswordField (String password) {
        onPages.fillInPasswordField(password);
    }

    @Step
    public void clickOnSubmitLoginButton() {
        onPages.clickOnSubmitButton();
    }

    @Step
    public void clickOnWomanTab() {
        onPages.clickOnWomanTab();
    }

    @Step
    public void checkOrangeColorsOnItem() {
        onPages.checkOrangeColorsOnItems();
    }

    @Step
    public void clickOnAddToCartButtonsOnItems(int count) {
        onPages.clickOnAddToCartButtonsOnItems(count);
    }

    @Step
    public void clickOnContactUsButton() {
        onPages.cl
    }





}
