package tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class ApiSmokeTest {

    @Test
    public void getUserShouldReturnValidResponse() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()
        .when()
            .get("/users/1")
        .then()
            .statusCode(200)
            .body("id", equalTo(1))
            .body("name", notNullValue());
    }
}
