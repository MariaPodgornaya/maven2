package steps;

import com.sun.org.glassfish.external.probe.provider.annotations.ProbeListener;
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

    @Step
    public void fillInEmailAddress (String email) {
        onPage.fillInEmailAddress(email);
    }
}
