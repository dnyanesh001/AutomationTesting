package basicHttpRequest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class PostRequest {

	public static void main(String[] args) {
//		https://reqres.in/api/users

//		Specify the base URI to RestAssured
		RestAssured.baseURI = "https://reqres.in";

		given().log().all().header("Content-Type", "application/json")
				.body("{\r\n" + "    \"name\": \"Eric\",\r\n" + "    \"job\": \"Senior QA\"\r\n" + "}").when()
				.post("api/users").then().log().all().assertThat().statusCode(201);
	}

}

//	RestAssured can follow BDD approach for developing automation script
//	given	: specify pre-requisites --> specify the request/input specifications
//  when	: specify user action    --> specify the http method/request
//	then	: specify the validation --> specify the validations