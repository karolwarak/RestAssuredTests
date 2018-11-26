import org.apache.http.HttpStatus;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Zad_3_Test extends Jsonplaceholder {

    @Test
    public void checkIfUserCanCreatePost() {

        Map<String, Object> postFromUser = new HashMap<String, Object>();
        postFromUser.put("id", 101);
        // mozna dopisac reszte pol dla obiektu post ale dla testu chyba nie ma takiej potrzeby

        given()
                .contentType("application/json")
                .body(postFromUser)

                .when()
                .post(path("/posts"))

                .then()
                .statusCode(HttpStatus.SC_CREATED)
                .and()
                .body(
                        "id", equalTo(postFromUser.get("id"))
                )
                .log().all();
    }
}
