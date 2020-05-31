package tests;

import net.thucydides.core.annotations.Steps;
import steps.ContactUsSteps;
import steps.MainSteps;

public class User {

    @Steps
    public MainSteps mainPage;

    @Steps
    public ContactUsSteps contactUsPage;
}
