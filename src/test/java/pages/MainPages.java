package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.nio.channels.Selector.open;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

@DefaultUrl("http://automationpractice.com/index.php")
public class MainPages extends BasePage {

    @FindBy(css = "a.login" )
    private WebElement signInButton;

    @FindBy (xpath = "//*[@id='create-account_form']/div/p")
    private WebElement createAnAccountText;

    @FindBy (id = "email")
    private WebElement emailField;

    @FindBy (id = "SubminLogin")
    private WebElement signInButtonOnLoginPage;

    @FindBy (xpath = "//*[@id='block_top_menu']//")
    private  WebElement womanTab;

    @FindBy(css = "a[style='background:#F39C11;']" )
    private WebElement orangeBox;

    @FindBy(css = "ul[class='color_to_pick_list clearfix']" )
    private List<WebElement> colorBoxes;

    @FindBy (xpath = "//*[@id='center_column']/ul/li")
    private List<WebElement> moveToItem;

    @FindBy(css = "a[title='Add to cart'][data-id-poduct]")
    private List<WebElement> addToCartButtons;

    @FindBy (xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")
    private WebElement continueShoppingButton;

    @FindBy (id = "passwd")
    private WebElement passwordField;
    private WebElement emailAddressField;
    private WebElement WomanTab;

    protected MainPages (WebDriver driver) {
        super (driver);
    }

    public void openMainPage() {
        open();
    }

    public void clickOnSignButton() {
        element (signInButton).click();
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
        element (emailAddressField).sentKeys(email);
    }

    public  void fillInPasswordField (String password) {
        element (passwordField).sendKeys(password);
    }

    public void clickOnSubmitButton () {
        element(signInButtonOnLoginPage).click();
    }

    public void clickOnWomanTab() {
        element(WomanTab).click();
    }

    private List<WebElement> getColorBoxes () {
        return colorBoxes;
    }

    public void checkOrangeColorsOnItems() {
        int counter = 0;
        for (int i=0; i < getColorBoxes().size(); i++) {
            if (getColorBoxes().get(i).findElement(By.cssSelector("a[style='background:#F39C11;']")).size() == 1){
                counter ++;
            }

        }

        Assert.assertEquals(3, counter);
    }

    private List<WebElement> getMoveToItemList() {
        return  moveToItem;
    }

    private List<WebElement> getAddToCartButtons() {
        return addToCartButtons;
    }

    public void clickOnAddToCartButtonsOnItems (int count) {
        for (int i = 0; i < count; i ++) {
            withAction().moveToElement(moveToItem.get(i)).perform();
            getDriver().findElement(By.cssSelector("a[title='Add to cart'][data=id-product =" +
                   " '''+(i+1) + '''")).click();
            element(continueShoppingButton).click();
        }
    }


}
