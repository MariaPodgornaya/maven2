package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ContactUsPage;

public class ContactUsSteps extends ScenarioSteps {
    ContactUsPage onPage;

    @Step
    public void fillInEmailAddressField (String email) {
        onPage.fillInEmailAddressField(email);
    }

    @Step
    public void clickOnSubjectHeadingDropdown() {
        onPage.clickOnSubjectHeadingDropdown();
    }

    @Step
    public void clickOnOrderReferenceDropdown () {
        onPage.clickOnOrderReferenceDropdown();
    }

    @Step
    public void clickOnAttachFileField () {
        onPage.clickOnAttachFileField();
    }

    @Step
    public void fillInMessField (String mess) {
        onPage.fillInMessField(mess);
    }

    @Step
    public void clickOnSendButton () {
        onPage.clickOnSendButton();
    }


}



