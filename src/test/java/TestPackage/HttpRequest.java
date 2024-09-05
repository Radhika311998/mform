package TestPackage;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.matcher.RestAssuredMatchers;
import org.hamcrest.Matchers;

/*given(): API request
 Content type, set cookies, add auth, add pram, set headerinfo etc....
*/
//when(): Request type (get, post ,put, patch,delete)
//then(): validate response (Validate status code, extract response, extract header cookies &response body...)
public class HttpRequest {
	
	@Test
	void getUser()
	{
		given()
		
		.when()
			.get()
		
		.then()
			.statusCode(200);
		
		
	}

	private RestAssured given() {
		
		return null;
	}

}
