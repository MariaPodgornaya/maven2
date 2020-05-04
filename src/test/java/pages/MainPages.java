package pages;

@DefaultUrl ("http://automationpractice.com/index.php")
public class MainPages extends BasePage {

    @FindBy (css -"a.login" )
    private WebElement signInButton;

    @FindBy (id - "email")
    private WebElement emailField;

    public MainPage (webDriver driver) {
        super(driver);
    }

    public void openMainPage() {
        open();
    }
    public void clickOnSignButton() {
        element(signButton).click();
    }

    public void FillInEmailAddress(String email) {
        element (emailField).sendKeys(email);
    }

}
