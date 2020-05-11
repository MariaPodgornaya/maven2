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



}
