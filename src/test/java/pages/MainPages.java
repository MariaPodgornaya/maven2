package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.nio.channels.Selector.open;

@DefaultUrl("http://automationpractice.com/index.php")
public class MainPages extends BasePage {

    @FindBy(css = "a.login" )
    private WebElement signInButton;

    @FindBy (xpath = "//*[@id='create-account_form']/div/p")
    private WebElement createAnAccountText;

    @FindBy (id = "email")
    private WebElement emailField;

    @FindBy (id = "passwd")
    private WebElement passwordField;

    public void MainPage (WebDriver driver) {
        super (driver);
    }

    public void openMainPage() {
        open();
    }
    public void clickOnSignButton() {
        element (signButton).click();
    }

    public void FillInEmailAddress(String email) {
        element (emailField).sendKeys(email);
    }

    public void checkText() {
       String text = element(createAnAccountText).getText();
       System.out.println(text);
        Pattern pattern = Pattern.compile("^(Please\\senter\\s)");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Нашёл");
        } else {
            System.out.println("Не нашел");
        }
    }

    public  void fillInEmailAddressField (String email) {
        element (emailAddressField).sendKeys(email);
    }

    public  void fillInPasswordField (String password) {
        element (passwordField).sendKeys(password);
    }
}
