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
        onPage.openMainPage();
    }

    @Step
    public void fillInEmailAddress (String email) {
        onPage.fillInEmailAddress(email);
    }
}
