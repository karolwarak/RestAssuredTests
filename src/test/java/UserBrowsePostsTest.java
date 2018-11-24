import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class UserBrowsePostsTest extends Jsonplaceholder {

    @Test
    public void checkIfUserCanBrowsePost() {

        given()
                .contentType("application/json")
                .when()
                .get(path("users/1/posts")).then()
                .statusCode(200);
    }
}
