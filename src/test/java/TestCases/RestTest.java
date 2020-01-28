package TestCases;

import static io.restassured.RestAssured.delete;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestTest extends Base {

	@Test
	public void simple_get_test() {
		Response response = get(prop.getProperty("rest_endpoint"));
		System.out.println(response.asString());
		response.then().body("id", hasItems(10));
	}
	
	@Test(description = "Send Post to add Lisa/2000")
	public void post_test() {
		Response response = given().
				contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body("{\"name\": \"Lisa\",\"alias\": \"2000\"}")
				.when()
				.post(prop.getProperty("rest_endpoint"));
		System.out.println("POST Response\n" + response.asString());
		response.then().body("id", Matchers.any(Integer.class));
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 201 , "Correct status code returned");
		}
	}