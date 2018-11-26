import org.apache.http.HttpStatus;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.notNullValue;

public class Zad_1_Test extends HostnameUrl {

    @Test
    public void checkIfUserCanBrowsePost() {

        given()
                .contentType("application/json")

                .when()
                .get(path("/posts"))

                .then()
                .statusCode(HttpStatus.SC_OK)
                .and()
                .body(
                        "userId", notNullValue(),
                        "id", notNullValue(),
                        "title", notNullValue(),
                        "body", notNullValue()
                )
                .log().all();
    }
}
