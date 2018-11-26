import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Zad_8_Test extends Jsonplaceholder {

    @Test
    public void userWithWebsiteFieldEndsWithOrg() {



        given()
                .contentType("application/json")
                //.header("contentType", "application/json")

                .when()
                .get(path("/users"))

                .then()
                .statusCode(HttpStatus.SC_OK)
                .and()
                .body("findAll {it.website.endsWith('.org') }.size()", equalTo(2))
                .log().all();
    }
}
