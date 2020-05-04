package steps;

import pages.MainPages;

public class MainSteps extends ScenarioSteps{

    private MainPages onPages;

    @Step
    public void clickOnSignButton() {
        onPages.clickOnSignButton();
    }

    @Step
    public void openMainPage() {
        onPage.openMainPage();
    }
}
