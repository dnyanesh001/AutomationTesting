package basicHttpRequest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class GetRequest {

	public static void main(String[] args) {
//		https://reqres.in/api/users?page=2

		RestAssured.baseURI = "https://reqres.in";

		given().log().all().queryParam("page", "2").pathParam("pathParam", "users").when().get("api/{pathParam}").then()
				.assertThat().statusCode(200).log().all();
	}

}
