package basicHttpRequest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class DeleteRequest {

	public static void main(String[] args) {
//		https://reqres.in/api/users/2

		RestAssured.baseURI = "https://reqres.in";

		given().log().all().pathParam("path1", "users").pathParam("path2", "2").when().delete("api/{path1}/{path2}")
				.then().log().all().assertThat().statusCode(204);
	}

}
