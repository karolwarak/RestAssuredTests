import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Zad_5_Test extends Jsonplaceholder {

    @Test
    public void checkResponseForContentEncoding() {



        given()
                .contentType("application/json")
                //.header("contentType", "application/json")

                .when()
                .get(path("/posts"))

                .then()
                .statusCode(HttpStatus.SC_OK)
                .and()
                .header("Content-Encoding", "gzip")
                .log().all();
    }
}
