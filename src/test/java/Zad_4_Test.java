import org.apache.http.HttpStatus;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

public class Zad_4_Test extends Jsonplaceholder {

    @Test
    public void checkIfUserCanDeletePost() {


        given()
                .contentType("application/json")

                .when()
                .delete(path("/posts/1"))

                .then()
                .statusCode(HttpStatus.SC_OK)
                .and()
                .body(equalTo("{}"))
                .log().all();
    }
}
