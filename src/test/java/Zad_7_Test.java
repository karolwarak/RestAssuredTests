import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Zad_7_Test extends HostnameUrl {

    @Test
    public void verifyUserWithSpecificZipCode() {



        given()
                .contentType("application/json")
                //.header("contentType", "application/json")

                .when()
                .get(path("/users"))

                .then()
                .statusCode(HttpStatus.SC_OK)
                .and()
                .body("address.findAll {it.zipcode == '23505-1337'}.size()", equalTo(1))
                .log().all();
    }
}
