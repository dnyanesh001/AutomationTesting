package basicHttpRequest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class PutRequest {

	public static void main(String[] args) {
//		https://reqres.in/api/users/2
		RestAssured.baseURI = "https://reqres.in";

		given().log().all().header("Content-Type", "application/json").pathParam("pathParam1", "users")
				.pathParam("pathParam2", "2")
				.body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}").when()
				.put("api/{pathParam1}/{pathParam2}").then().assertThat().statusCode(200).log().all();
	}

}
