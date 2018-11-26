import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

public class Zad_2_Test extends Jsonplaceholder{

    @Test
    public void checkIfUserCanBrowserCommentsForOneSpecificPost(){

        String numberOfPost = "1";

        given()
                .contentType("application/json")
                .param("postId", numberOfPost)

                .when()
                .get(path("/comments"))

                .then()
                .statusCode(HttpStatus.SC_OK)
                .and()
                .body(
                        "findAll {it.postId == 1}.size()", equalTo(5)

                )
                .log().all();
    }
}
