package pages;

public class BasePage extends PageObject {

    protected BasePage (WebDriver driver) {
        super (driver);
        PageFactory.initElements(driver, this)
    }

}
