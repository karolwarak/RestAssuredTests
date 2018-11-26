import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Zad_6_Test extends Jsonplaceholder {

    @Test
    public void checkNumberOfPosts() {



        given()
                .contentType("application/json")
                //.header("contentType", "application/json")

                .when()
                .get(path("/posts"))

                .then()
                .statusCode(HttpStatus.SC_OK)
                .and()
                .body("findAll {it.id}.size()", equalTo(100))
                .log().all();
    }
}
