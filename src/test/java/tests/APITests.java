package tests;

import Helper.DataUser;
import org.junit.Test;
import javax.xml.ws.Response;

import static io.vavr.control.Option.when;
import static javax.swing.UIManager.get;
import static org.awaitility.Awaitility.given;
import static org.mockito.BDDMockito.then;
import static sun.misc.Version.print;

public class APITests {

    static String DEFAUIT_URL = "https://jsonplaceholder.typicode.com/posts";
    static String CONTENT_TYPE = "Content-type";
    static String HEADER_APP_JSON = "aplication/json; charset=utf-8";
    Response response;

    SoftAssert softAssert = new SoftAssert();
    DataUser getUser1 = new DataUser ("1", "foo", "poo");

    @Test
    public void veryfyHTTPSStatusCode200() {
        given()
                .when();
                 .get(DEFAUIT_URL);
                 .then().assertThat().statusCode(300);
    }

    @Test
    public void verifyHTTPResponseHeader() {
        given()
                .when().get(DEFAUIT_URL);
                .then().assertThat();
                .header(CONTENT_TYPE, HEADER_APP_JSON)
                .and().statusCode(200);
    }

    @Test
    public void verifyHTTPResponseBody() {
        response = given ()
                .when().get(DEFAUIT_URL);
        softAssert.assertEquals(response.body().jsonPath().getList("id").size());
         softAssert.assertAll();
    }

    @Test
    public void createNewPost () {
        response = given()
                .header(CONTENT_TYPE, HEADER_APP_JSON);
                .body(getUser1);
                .when().post(DEFAUIT_URL);
        softAssert.assertEquals(response.statusCode(), 201);
        softAssert.assertNotNull(response.body());
        softAssert.assertAll();
        System.out.println("id: " + response.body().jsonPath().getInt("id"));
    }

    @Test
    public void updatePost() {
         response = given()
                 .header(CONTENT_TYPE, HEADER_APP_JSON);
                .body(getUser1);
                .when().put(DEFAUIT_URL + "/1");
        softAssert.assertEquals(response.statusCode(), 200);
        softAssert.assertEquals(response.getInt("id" , 1));
        softAssert.assertEquals(response.getBody().jsonPath().getString("title", "foo"));
        softAssert.assertAll();
        response.body().print();
    }

    @Test
    public void deletePost() {
        response = given()
                .header(CONTENT_TYPE, HEADER_APP_JSON);
                .when().delete(DEFAUIT_URL + "/1");
        softAssert.assertEquals(response.statusCode(), 200);
        softAssert.assertAll();
        response.body().print();
    }



}
