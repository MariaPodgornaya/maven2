package tests;

import Helper.PropertiesHelper;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class apiTestForLogin {

    @Test
    public void apiTestForLogin() {
        Response responseForCookies = given()
                .param("email", PropertiesHelper.INSTANCE.getProperty("email"))
                .param("passwd", PropertiesHelper.INSTANCE.getProperty("password"))
                .param("back", "ma-account")
                .param("SubmitLogin", "")
                .post("http://automationpractice.com/index.php?controller=authentication")
                Map<String , String > loginCookies = responseForCookies.getCookies();

        Response responseForLogin = given()
                .cookies(getForLoin)
                .get("http://automationpractice.com/index.php?controller=" +
                        "authentication&back=my-account");

        String htmlPage = responseForLogin.asString();

        XmlPath xmlPath = new XmlPath (XmlPath.CompatibilityMode.HTML, htmlPage);
        String title = xmlPath.getString("");

        Assert.assertEquals("My account - My Store", title);

        System.out.println(responseForLogin.getBody().print());
    }

}
