package pages;

@DefaultUrl ("http://automationpractice.com/index.php")
public class MainPages extends BasePage {

    @FindBy (css -"a.login" )
    private WebElement signInButton;

    public MainPage (webDriver driver) {
        super(driver);
    }

    public void openMainPage() {
        open();
    }
    public void clickOnSignButton() {
        element(signButton).click();
    }

}
