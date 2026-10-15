package steps;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UserApiSteps {

    private io.restassured.response.Response response;

    @When("I request user with id {int}")
    public void requestUser(int id) {
        response = given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when()
                .get("/users/" + id);
    }

    @Then("the response status should be {int}")
    public void responseStatus(int status) {
        response.then().statusCode(status);
    }

    @Then("the response should contain user id {int}")
    public void responseContainsId(int id) {
        response.then().body("id", equalTo(id));
    }
}
