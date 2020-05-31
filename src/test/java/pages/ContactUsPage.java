package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {

    @FindBy(id = "MessSubmit")
    private WebElement sendButton;

    @FindBy(id = "email")
    private WebElement emailAddressField;

    @FindBy (id = "uniform-fileUpload")
    private  WebElement attachFileField;

    @FindBy (css = "[name = 'id_order']")
    private  WebElement orderReferenceDropdown;

    @FindBy (id = "mess")
    private  WebElement messField;

    @FindBy (id = "id_contact")
    private  WebElement subjectHeadingDropdown;


    protected ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public void fillInEmailAddressField(String email) {
        element(emailAddressField).sendKeys(email);
     }

    public void clickOnSubjectHeadingDropdown(String subjectValue) {
        element(subjectHeadingDropdown).click();
        selectFromDropdown(subject, subjectValue);
    }

    public void clickOnOrderReferenceDropdown() {
        element(orderReferenceDropdown).click();
    }

    public void clickOnAttachFileField(String pathToFile) {
        element(attachFileField).click();
        getDriver().switchTo().activeElement().sendKeys(pathToFile);
    }

    public void fillInMessField(String mess) {
        element(messField).sendKeys(mess);
    }

    public void clickOnSendButton() {
        element(sendButton).click();
    }


}
